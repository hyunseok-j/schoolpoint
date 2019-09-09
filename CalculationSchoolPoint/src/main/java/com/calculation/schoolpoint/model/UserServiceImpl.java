package com.calculation.schoolpoint.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO dao;

    public void registerUser(UserVO vo){ dao.registerUser(vo);}

    public UserVO getUser(UserVO vo) {
        return dao.getUser(vo);
    }

    public UserVO login(UserDTO dto) { return dao.login(dto); }

    public List<UserVO> getListUser(UserVO vo) {
        return dao.getListUser(vo);
    }
}
