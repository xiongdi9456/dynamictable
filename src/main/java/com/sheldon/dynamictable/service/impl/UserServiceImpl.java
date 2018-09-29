package com.sheldon.dynamictable.service.impl;

import com.sheldon.dynamictable.dao.UserDeviceMapper;
import com.sheldon.dynamictable.dao.UserMapper;
import com.sheldon.dynamictable.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private UserDeviceMapper userDeviceMapper;

  private final Logger logger = LogManager.getLogger("sdkservice");


  @Override
  public void registUser(Integer gameId, String udid, String userId) {
    String tableName = "user"+gameId;
    userMapper.registUser(tableName, getMapperString(udid), getMapperString(userId));

  }

  @Override
  public void registeDeviceToUser(Integer gameId, String udid, String userId, String loginType) {
    String tableName = "user_device"+gameId;
    userDeviceMapper.updateOrInsertUserDevice(tableName,getMapperString(udid),getMapperString(userId),getMapperString(loginType));

  }

  private String getMapperString(String userInputStr){
    return "'" + userInputStr + "'";
  }
}
