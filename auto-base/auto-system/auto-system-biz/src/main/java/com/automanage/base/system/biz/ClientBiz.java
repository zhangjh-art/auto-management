package com.automanage.base.system.biz;

import com.automanage.base.system.bo.client.ClientOutBo;
import com.automanage.base.system.mapper.TSysUserMapper;
import com.automanage.base.system.po.TSysUser;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Component
@Setter
@Slf4j
public class ClientBiz {
    @Resource
    //用户表
    private TSysUserMapper tSysUserMapper;

    public ClientOutBo loadUserByUsername(String userName) {
        Example example = new Example(TSysUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name",userName);
        List<TSysUser> user = tSysUserMapper.selectByExample(example);
        ClientOutBo out = new ClientOutBo();
        if(user.size()>0){
            out.setUsername(user.get(0).getName());
            out.setPassword(user.get(0).getPassword());
            out.setCode("0000");
        }else{
            out.setCode("8888");
        }
        return out;
    }
}
