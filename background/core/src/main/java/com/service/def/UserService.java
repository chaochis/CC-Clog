package com.service.def;

import com.model.UserVO;

import java.util.List;

public interface UserService {

    public List<UserVO> getAllUser();

    public void saveUser(UserVO userVO);

    public void deleteUsers(String [] ids);

}
