package com.schiva.test3.controller;

import com.schiva.test2.dao.test2VO;
import com.schiva.test3.service.test3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class test3Controller {

    @Autowired
    test3Service svc;

    @RequestMapping(value = "/save3.do")
    public void testInsert(){
        test2VO record = new test2VO();

        record.userid = "robert";
        record.name   = "장보고";
        record.email  = "schiva@test.com";

        try {
            svc.insertTest(record);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
