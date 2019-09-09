package com.calculation.schoolpoint.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public void registerUser(UserVO vo){
        sqlSessionTemplate.insert("UserDAO.registerUser",vo);
    }

    public UserVO getUser(UserVO vo){
        return (UserVO)sqlSessionTemplate.selectOne("UserDAO.getUser",vo);
    }

    public UserVO login(UserDTO dto){
        return (UserVO)sqlSessionTemplate.selectOne("UserDAO.loginUser",dto);
    }

    public List<UserVO> getListUser(UserVO vo){
        return sqlSessionTemplate.selectList("UserDAO.getUserList");
    }

}
