package com.calculation.schoolpoint.model;

import java.util.List;

public interface UserService {
    UserVO getUser(UserVO vo);
    List<UserVO> getListUser(UserVO vo);
}
