package com.ppdz.side.service.user.impl;

import com.ppdz.side.dao.UserInfoDao;
import com.ppdz.side.service.user.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserInfoServiceImpl  implements UserInfoService {
    private UserInfoDao userInfoDao;
    public UserInfoServiceImpl(UserInfoDao userInfoDao){
        this.userInfoDao = userInfoDao;
    }

    @Override
    public Map<String, Object> RegUser(Map<String, Object> info) {
        Map<String, Object> resultMap=new HashMap<>();
        //0代表注册成功
        //1代表注册重复
        // 2代表未知错误
        if (userInfoDao.QueryUser(info)==0){
            if (userInfoDao.RegUser(info) > 0){
                resultMap.put("status",0);
            }else {
                resultMap.put("status",2);
            }
        }else {
            resultMap.put("status",1);
        }

        return resultMap;
    }
}
