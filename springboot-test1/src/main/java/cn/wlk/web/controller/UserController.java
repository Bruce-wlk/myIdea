package cn.wlk.web.controller;

import cn.wlk.model.User;
import cn.wlk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("user")
public class UserController {
    @RequestMapping("{id}")
    @ResponseBody
    //通过id查询用户信息
    public User userInfo(@PathVariable() Integer id){
        User user = new User("wlk","123");
        user.setId(id);
//        int i = 10/0;
        return user;
    }


    @Autowired
    private IUserService userService;
    @RequestMapping("register")
    public String register(String name,String stuClass){
        userService.register(name,stuClass);
        return "success";

    }

    @RequestMapping("find")
    public User findByName(String name){
        return userService.findByName(name);
    }

}
