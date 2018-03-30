package com.schiva.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("testService")
public class testService {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource(name="testDAO")
    private testDAO dao;

    public List<testVO> getSelectAll(){
        List<testVO> result = dao.selectAll();

        logger.info("selectAll()", result);
        return result;
    }
}
