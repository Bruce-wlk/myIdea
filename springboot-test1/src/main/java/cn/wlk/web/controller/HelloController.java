package cn.wlk.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  //声明rest风格控制器
@EnableAutoConfiguration //自动配置，相当于spring配置文件
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody //响应体，自动返回json格式字符串
    public String hello(){
        return "Hello SpringBoot";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
