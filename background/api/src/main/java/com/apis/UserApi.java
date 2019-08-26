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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
@AllArgsConstructor
@Api(value = "登陆注册模块",tags = {"用户接口"})
public class UserApi {

    private UserService userService;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @GetMapping("/login")
    @ApiOperation("登录")
    public String login(UserModel userModel){
        List<UserVO> list = this.userService.getAllUser();
        String token = TokenUtil.generateToken();
        redisTemplate.opsForValue().set(token,new UserVO());
        UserVO userVo = (UserVO)redisTemplate.opsForValue().get(token);
        return userVo.toString();
    }

}
