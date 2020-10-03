package cn.wlk.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @RequestMapping("login")
    public Map<String,Object> checkout(String username,String password){
        Map<String,Object> map = new HashMap<>();
        if("wlk".equals(username)&&"123".equals(password)){
            map.put("success",1);
            map.put("errMsg","");
        }else{
            map.put("success",0);
            map.put("errMsg","用户名或密码不正确！");
        }
        return map;
    }
}
