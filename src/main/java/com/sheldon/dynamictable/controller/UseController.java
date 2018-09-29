package com.sheldon.dynamictable.controller;

import com.sheldon.dynamictable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Sheldon
 * @Date: 2018/09/29 13:08
 */

@RestController
public class UseController {

    @Autowired
    private UserService mUserService;


    @RequestMapping(value = "/user/regist", method = RequestMethod.GET)
    public String regist(Integer gameId, String udid, String uid) {

        mUserService.registUser(gameId,udid,uid);
        mUserService.registeDeviceToUser(gameId,udid,uid,"1");
        return "ok";
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.GET)
    public String update(Integer gameId, String udid, String uid) {

        mUserService.updateUser(gameId,udid,uid);
        return "ok";
    }



}
