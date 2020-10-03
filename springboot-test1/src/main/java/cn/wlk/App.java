package cn.wlk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration //配置了这个之后，其他控制器的此项配置不再需要
@ComponentScan(basePackages = {"cn.wlk.web","cn.wlk.service"})
@MapperScan(basePackages={"cn.wlk.mapper"})//扫描Mapper
public class App {
    public static void main( String[] args )
    {
        //启动springboot项目
        SpringApplication.run(App.class,args);
    }
}
