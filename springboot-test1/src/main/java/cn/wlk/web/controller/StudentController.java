package cn.wlk.web.controller;

import cn.wlk.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController  //一般用于写api，返回json数据。
@Controller  //一般用于写后台系统（返回指定页面）
@RequestMapping("stu")
public class StudentController {
    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("username","wlk");
        model.addAttribute("age",16);
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student(1001,"wlk","男"));
        stuList.add(new Student(1002,"kep","男"));
        stuList.add(new Student(1003,"wdlm","男"));
        model.addAttribute("stuList",stuList);
        return "stu/list";  //找模板页面
    }
}
