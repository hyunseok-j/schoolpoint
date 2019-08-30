package com.calculation.schoolpoint.model;

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
//    @Qualifier("template")
    private JdbcTemplate template;

    private final String GET_USER = "select * from user where id=? and password=?";
    private final String GETLIST_USER = "select * from user";

//    @Autowired
//    @Qualifier("template")
//    public void setTemplate(JdbcTemplate template){
//        this.template = template;
//    }

    public UserVO getUser(UserVO vo){

        Object[] args ={vo.getId(),vo.getPassword()};
        return (UserVO)this.template.queryForObject(GET_USER,args,new UserRowMapper());

    }

    public List<UserVO> getListUser(UserVO vo){

        return this.template.query(GETLIST_USER,new UserRowMapper());

    }

}

class UserRowMapper implements RowMapper<UserVO> {

    public UserVO mapRow(ResultSet resultSet, int i) throws SQLException {

        UserVO user = new UserVO();
        user.setSeq(resultSet.getInt("seq"));
        user.setId(resultSet.getString("id"));
        user.setPassword(resultSet.getString("password"));

        return user;
    }
}
