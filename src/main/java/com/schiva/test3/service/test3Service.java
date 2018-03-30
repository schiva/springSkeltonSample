package com.schiva.test3.service;

import com.schiva.test2.dao.test2VO;
import com.schiva.test3.dao.test3Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class test3Service {

    @Autowired
    test3Dao dao;

    public void insertTest(test2VO record) throws SQLException {
        dao.insertData(record);
    }
}
