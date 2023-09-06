package com.ksboard.bootstrap.layout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bootstrap/layout")
public class LayoutController {

    @GetMapping("/breakpoints")
    public String Layout() {
        return "/bootstrap/layout/breakpoints";
    }

    @GetMapping("/containers")
    public String Containers() {
        return "/bootstrap/layout/containers";
    }

}
