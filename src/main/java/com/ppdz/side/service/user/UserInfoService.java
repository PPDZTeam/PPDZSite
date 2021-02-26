package com.ppdz.side.service.user;

import java.util.Map;

public interface UserInfoService {
    /**
     * 用户注册
     * @return
     */
    Map<String, Object> RegUser(Map<String,Object> info);
}
