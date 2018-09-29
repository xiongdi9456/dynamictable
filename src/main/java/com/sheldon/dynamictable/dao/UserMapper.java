package com.sheldon.dynamictable.dao;

import com.sheldon.dynamictable.common.MyMapper;
import com.sheldon.dynamictable.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends MyMapper<User> {

    void registUser(@Param("tableName") String tableName, @Param("udid") String udid, @Param("uid") String uid );
    void updateUser(@Param("tableName") String tableName, @Param("udid") String udid, @Param("uid") String uid );
}