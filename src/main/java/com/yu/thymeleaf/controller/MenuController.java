package com.yu.thymeleaf.controller;

import com.alibaba.fastjson.JSON;
import com.yu.thymeleaf.domain.Menu;
import com.yu.thymeleaf.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName MenuController.java
 * @Description TODO
 * @Date 2019/12/22 11:00
 */
@Controller
public class MenuController {

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;

    @ResponseBody
    @RequestMapping("getMenuTestList")
    public Object getMenuTestList() {

        Map<String, Object> map = new HashMap<String, Object>();
        List<Menu> list = menuMapper.getMenuTestList();
        Object s = JSON.toJSON(list);
        System.out.println(s);

        map.put("menulist", list);

       /* try {
            response.getWriter().print(JSON.toJSONString(list));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        return map;
    }

}
