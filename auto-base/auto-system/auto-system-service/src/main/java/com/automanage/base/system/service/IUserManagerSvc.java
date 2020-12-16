package com.automanage.base.system.service;

import com.automanage.base.common.result.Result;
import com.automanage.base.system.dto.userManager.UserInDTO;
import com.automanage.base.system.dto.userManager.UserOutDTO;

import java.util.Map;

/**
 * 用户管理相关服务
 * @author zhangjh
 */
public interface IUserManagerSvc {
    Result<Map<String, Object>> getUserInfoByName(Map<String, String> map) throws Exception;
    UserOutDTO queryUserList(UserInDTO inDTO) throws Exception;
}
