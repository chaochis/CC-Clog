package com.apis;

import com.model.UserVO;
import com.service.def.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
@AllArgsConstructor
public class UserApi {

    private UserService userService;

    @GetMapping("login")
    public List<UserVO> login(){
        return this.userService.getAllUser();
    }
}
