package com.ppdz.side.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserInfoDao {
    /**
     * 用户注册
     * @return
     */
    Integer RegUser(Map<String,Object> info);
}
