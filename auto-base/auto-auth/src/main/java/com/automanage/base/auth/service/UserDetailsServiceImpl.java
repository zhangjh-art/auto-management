package com.automanage.base.auth.service;

import com.automanage.base.auth.domain.User;
import com.automanage.base.common.constants.AuthConstants;
import com.automanage.base.common.result.Result;
import com.automanage.base.common.result.ResultCode;
import com.automanage.base.system.dto.ClientDTO;
import com.automanage.base.system.service.IClientSvc;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;


/**
 * 自定义用户认证和授权
 */
@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private IClientSvc clientSvc;
    private HttpServletRequest request;

    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String clientId = request.getParameter("client_id");
        User user = null;
        switch (clientId) {
            case AuthConstants.ADMIN_CLIENT_ID: // 后台用户
                Result<ClientDTO>  userResult;
                userResult = clientSvc.loadUserByUsername(username);
                if (userResult == null || !ResultCode.SUCCESS.getCode().equals(userResult.getCode())) {
                    throw new UsernameNotFoundException("用户不存在");
                }
                ClientDTO userDTO = userResult.getData();
                userDTO.setClientId(clientId);
                user = new User(userDTO);
                break;
        }
        user.setEnabled(true);//默认激活，稍稍删除
        if (!user.isEnabled()) {
            throw new DisabledException("该账户已被禁用!");
        } else if (!user.isAccountNonLocked()) {
            throw new LockedException("该账号已被锁定!");
        } else if (!user.isAccountNonExpired()) {
            throw new AccountExpiredException("该账号已过期!");
        } else if (!user.isCredentialsNonExpired()) {
            throw new CredentialsExpiredException("该账户的登录凭证已过期，请重新登录!");
        }
        return user;

    }

}
