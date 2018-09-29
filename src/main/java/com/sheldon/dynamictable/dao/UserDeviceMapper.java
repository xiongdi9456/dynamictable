package com.sheldon.dynamictable.dao;

import com.sheldon.dynamictable.common.MyMapper;
import com.sheldon.dynamictable.entity.UserDevice;
import org.apache.ibatis.annotations.Param;

public interface UserDeviceMapper extends MyMapper<UserDevice> {

    void updateOrInsertUserDevice(@Param("tableName") String tableName, @Param("udid") String udid, @Param("userId") String userId, @Param("loginType") String loginType);
}