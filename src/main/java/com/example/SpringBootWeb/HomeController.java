package com.example.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result= num1+num2;
//        // we have to send the added data to the result page we need to send it
//        //to maintain the data between multiple pages is thorgh session
//        session.setAttribute("result",result);
//        System.out.println(num1+num2);
//        return "result.jsp";
//    }



    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, HttpSession session){
        // it will not work with the diffrent name that of the variable actually given
        int result= num+num2+10;
        // we have to send the added data to the result page we need to send it
        //to maintain the data between multiple pages is thorgh session
        session.setAttribute("result",result);
        System.out.println(num+num2);
        return "result.jsp";
    }
}
