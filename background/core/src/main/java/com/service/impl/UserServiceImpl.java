package com.service.impl;

import com.mapper.UserMapper;
import com.model.UserVO;
import com.service.def.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public List<UserVO> getAllUser() {
        return this.userMapper.selectList(null);
    }

    @Override
    public void saveUser(UserVO userVO) {

    }

    @Override
    public void deleteUsers(String[] ids) {

    }

}
