package com.util;

import java.util.UUID;

public class TokenUtil {

    public static String generateToken(){
         return "user".concat(UUID.randomUUID().toString().replace("-",""));
    }
}
