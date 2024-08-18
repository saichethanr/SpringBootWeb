package com.example.SpringBootWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //whatever is returned by the below  function should be a view technoloy
    //but every url should match with the method first
    //by deafult springboot does not support the jsp page we have to convert it into a servlet----addd tomcat jasper in dependency
    //the request aping method below maps the home apage to  the method
    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        return "index.jsp";
    }
}
