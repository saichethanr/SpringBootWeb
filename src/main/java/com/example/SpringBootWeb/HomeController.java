package com.example.SpringBootWeb;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    //whatever is returned by the below  function should be a view technoloy
    //but every url should match with the method first
    public String home(){
        System.out.println("home method called");
        return "index.jsp";
    }
}
