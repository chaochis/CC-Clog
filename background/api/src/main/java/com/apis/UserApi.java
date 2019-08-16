package com.apis;

import com.apimodel.UserModel;
import com.model.UserVO;
import com.service.def.UserService;
import com.util.TokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
@AllArgsConstructor
@Api(value = "用户登陆模块",tags = {"用户接口"})
public class UserApi {

    private UserService userService;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @PostMapping("login")
    @ApiOperation("登录")
    public String login(UserModel userModel){
        List<UserVO> list = this.userService.getAllUser();
        String token = TokenUtil.generateToken();
        return token;
    }

}
