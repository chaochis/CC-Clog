package com.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.regex.Pattern;

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
