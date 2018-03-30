package com.schiva.test3.dao;

import com.schiva.test2.dao.test2VO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class test3Dao {

    @Autowired
    SqlSession session;

    public  void insertData(test2VO record) throws SQLException {
        session.insert("test2.insertData", record);
    }
}
