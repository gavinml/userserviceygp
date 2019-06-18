package com.inspur.userservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class IndexController {
    @RequestMapping("/")
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("hplus/index.html");
//        return "hplus/index.html";
    }
}
