package com.yaoxj.SpringSecurity.control;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminControl {

    @RequestMapping("/mypath")
    public String getAdminPath(){
        return "admin";
    }
}
