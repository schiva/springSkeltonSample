package com.schiva.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class testController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource(name = "testService")
    private testService TestService;

    public void setTestService(testService testService) {
        TestService = testService;
    }


    @RequestMapping(value="/test.do")
    public String testList(Model model){

        model.addAttribute("list", TestService.getSelectAll());
        return "test";
    }


}
