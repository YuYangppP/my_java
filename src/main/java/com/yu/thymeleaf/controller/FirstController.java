package com.yu.thymeleaf.controller;

import com.yu.thymeleaf.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName FirstController.java
 * @Description TODO
 * @Date 2019/12/17 16:09
 */
@Controller
public class FirstController {

    @GetMapping("index1")
    public String index1(Model model){
        model.addAttribute("msg", "Hello, Thymeleaf!");
        return "index1";
    }

    @GetMapping("index2")
    public String index2(Model model){
        List<User> user = new ArrayList<>();
        user.add(new User("张三",18,"男"));
        user.add(new User("李四",19,"男"));
        user.add(new User("王五",18,"女"));
        model.addAttribute("user",user);
        return "index2";
    }

    @GetMapping("index3")
    public String index3(Model model){
        model.addAttribute("today", new Date());
        return "index3";
    }

    @GetMapping("all-admin-index")
    public String index4(){
        return "all-admin-index";
    }

    @GetMapping("dd")
    public String index5(){
        return "dd";
    }

}