package com.example.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
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

    //the data is beeing sent as a query param so we need to accept the servlet
    @RequestMapping("add")
    public String add(HttpServletRequest req){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int res= num1+num2;
        System.out.println(num1+num2);
        return "result.jsp";
    }
}
