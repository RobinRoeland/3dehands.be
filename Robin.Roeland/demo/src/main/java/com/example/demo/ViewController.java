package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ViewController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/add")
    public String add(){
        return "add";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }
}
