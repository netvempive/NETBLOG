package com.zc.ctrl;

import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by netvempive on 2014/11/18.
 */
@Controller
public class WelcomeController {

    @RequestMapping(value="welcome",method = RequestMethod.PUT)
    public ModelAndView welcome(String userName){




        ModelAndView mv = new ModelAndView("welcome");
        mv.addObject("message","welcome to my page : " + userName);
        return mv;
    }
}
