package com.sheldon.dynamictable.service;

public interface UserService {

    void registUser(Integer gameId, String udid, String userId);
    void registeDeviceToUser(Integer gameId, String udid, String userId, String loginType);

}
