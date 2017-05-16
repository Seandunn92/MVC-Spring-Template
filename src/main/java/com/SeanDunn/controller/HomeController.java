package com.SeanDunn.controller;

/**
 * Created by seandunn92 on 5/9/17.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld(Model model)
    {
        String name = "Sean";
        model.addAttribute("message2", "Trina");
        model.addAttribute("message3", "Stephanie");

        return new
                ModelAndView("welcome","message",name);

    }

    @RequestMapping("/welcome2")

        public String addStuff(Model model){

            model.addAttribute("message", "Antonella");
        model.addAttribute("message2", "Trina");
        model.addAttribute("message3", "Stephanie");
            return "addStuff";
        }


}