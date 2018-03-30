package com.schiva.test2.service;

import com.schiva.test2.dao.test2Dao;
import com.schiva.test2.dao.test2VO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class test2ServiceImp implements test2Service {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private test2Dao dao;

    @Override
    public void insertTest(test2VO record) throws SQLException{
        dao.insertData(record);
        dao.insertData(record);
    }
}
