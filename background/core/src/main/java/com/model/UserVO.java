package com.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisUtils;

import java.io.Serializable;


@Data
@TableName("user")
public class UserVO implements Serializable {

    @TableId("Id")
    private String id;

    @TableField("username")
    private String userName;

    @TableField("password")
    private String password;

    @TableField("email")
    private String email;

}
