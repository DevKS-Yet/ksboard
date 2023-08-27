package com.ksboard.board.controller;

import com.ksboard.board.service.게시판;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class 게시판제어자 {

    @Autowired
    private 게시판 게시판;

    @GetMapping("/list")
    public String list() {
        return "/board/리스트";
    }

}
