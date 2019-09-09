package com.calculation.schoolpoint.model;

import java.util.List;

public interface UserService {
    void registerUser(UserVO vo);
    UserVO getUser(UserVO vo);
    UserVO login(UserDTO dto);
    List<UserVO> getListUser(UserVO vo);
}
