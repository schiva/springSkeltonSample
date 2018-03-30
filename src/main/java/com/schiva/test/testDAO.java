package com.schiva.test;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("testDAO")
public class testDAO {

    @Autowired
    private SqlSession session;

    public void setSession(SqlSession session) {
        this.session = session;
    }

    public List<testVO> selectAll(){
        List<testVO> list = session.selectList("study.selectAll");
        return  list;
    }
}
