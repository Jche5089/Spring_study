package com.example.study.controller;

import com.example.study.service.UserInfoService;
import com.example.study.domain.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
public class UserInfoController {
    private final UserInfoService userInfoService;
    // url 매핑
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<UserInfo> users = userInfoService.getAllUsers();
        model.addAttribute("users", users);
        return "userList";
    }
    
}
