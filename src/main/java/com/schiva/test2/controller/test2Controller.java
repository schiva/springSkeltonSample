package com.schiva.test2.controller;

import com.schiva.test2.service.test2Service;
import com.schiva.test2.service.test2ServiceImp;
import com.schiva.test2.dao.test2VO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.SQLException;

@Controller
public class test2Controller {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private test2Service svc;

    @RequestMapping(value="/save.do")
    public void testInsert(){
        test2VO record = new test2VO();

        record.userid = "schiva";
        record.name   = "홍길동";
        record.email  = "schiva@schiva.com";

        try {
            svc.insertTest(record);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
