package com.zc.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    @RequestMapping(value="hello",method= RequestMethod.GET)
    public ModelAndView handleRequest() {

       ModelAndView mv = new ModelAndView("hello");

       mv.addObject("message", "Hello World!");  

       return mv;  
    }  
}  