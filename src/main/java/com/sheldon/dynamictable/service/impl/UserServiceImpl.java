package com.sheldon.dynamictable.service.impl;

import com.sheldon.dynamictable.dao.UserDeviceMapper;
import com.sheldon.dynamictable.dao.UserMapper;
import com.sheldon.dynamictable.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

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
  public void updateUser(Integer gameId, String udid, String userId) {
    String tableName = "user"+gameId;
    userMapper.updateUser(tableName, getMapperString(udid), getMapperString(userId));

  }

  @Override
  public void registeDeviceToUser(Integer gameId, String udid, String userId, String loginType) {
    String tableName = "user_device"+gameId;
    userDeviceMapper.updateOrInsertUserDevice(tableName,getMapperString(udid),getMapperString(userId),getMapperString(loginType));

  }

  @Override
  @Transactional
  public void transactionTest() {
    try {

      ///insert to 2 tables
      userMapper.registUser("user1","1111","222");

    }catch (Exception ex){
      //事物回滚
      TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
      //log here
    }
  }

  private String getMapperString(String userInputStr){
    return "'" + userInputStr + "'";
  }
}
