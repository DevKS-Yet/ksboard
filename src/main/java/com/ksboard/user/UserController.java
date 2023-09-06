package com.ksboard.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String getLogin1() {
        return "user/login";
    }

    @PostMapping("/login")
    public String postLogin(UserVo userVo) {
        userService.login(userVo);
        return "/user/loginSucces";
    }


}
