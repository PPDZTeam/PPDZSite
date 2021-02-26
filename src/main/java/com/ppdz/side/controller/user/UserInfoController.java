package com.ppdz.side.controller.user;

import com.google.gson.Gson;
import com.ppdz.side.service.user.UserInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    /**
     * 实例化UserInfoService
     * 实例化Gson解析器
     */
    private final UserInfoService userInfoService;
    private final Gson gson;
    public UserInfoController(UserInfoService userInfoService){
        this.userInfoService = userInfoService;
        this.gson = new Gson();
    }

    /**
     * 解析Data
     */
    public Map<String,Object> Parsing(String data){
        return gson.fromJson(data,Map.class);
    }

    /**
     * 封装Data
     */
    public String Package(Map<String,Object> data){
        return gson.toJson(data);
    }

    @PostMapping("/reguser")
    public String RegUser(@RequestBody String info){
        return Package(userInfoService.RegUser(Parsing(info)));
    }
}
