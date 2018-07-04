package com.ctban.swallow.controller;

import com.ctban.swallow.dto.UserDTO;
import com.ctban.swallow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJie 2018/7/4 9:04
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    Environment ev;

    @Autowired
    UserService userService;

    @RequestMapping("/findUserInfoByUserId")
    @ResponseBody
    public List<UserDTO> findUserInfoByUserId(@RequestBody UserDTO userDTO) {
        List<UserDTO> list = new ArrayList<>();
        list.add(userService.findUserInfoId(userDTO.getId()));
        return list;
    }

    @RequestMapping("testJsp")
    public String testJsp() {

        return "hello";
    }
}

