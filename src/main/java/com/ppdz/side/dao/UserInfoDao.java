package com.ppdz.side.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserInfoDao {
    /**
     * 用户注册
     * @return
     */
    Integer RegUser(@Param("info") Map<String,Object> info);

    Integer QueryUser(@Param("info") Map<String,Object> info);
}
