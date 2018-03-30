package com.schiva;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("greeting","Hello Spring MVC");

        return "home";
    }

    @RequestMapping("/main.do")
    public String main(Model model){
        log.info("main.do .. log");
        model.addAttribute("data", "Hello Main Page");

        return "main";
    }

}
