package com.projects.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class contactController {
    
    @RequestMapping("contact")
    @ResponseBody
    public String getContactPage(){
        return "Contact Us";
    }
}
