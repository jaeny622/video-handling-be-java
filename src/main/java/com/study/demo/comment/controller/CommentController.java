package com.study.demo.comment.controller;

import com.study.demo.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
}
