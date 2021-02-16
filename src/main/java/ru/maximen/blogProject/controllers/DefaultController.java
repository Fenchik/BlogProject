package ru.maximen.blogProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping ("/")
    public String mainScreen(){
        return "index";
    }

}
