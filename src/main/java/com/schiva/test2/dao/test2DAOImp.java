package com.schiva.test2.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class test2DAOImp implements test2Dao{

    @Autowired
    private SqlSession session;

    public void setSession(SqlSession session) {
        this.session = session;
    }

    @Override
    public void insertData(test2VO record) throws SQLException{

        session.insert("test2.insert", record);
    }


}
