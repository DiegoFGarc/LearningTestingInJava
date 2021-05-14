package com.learning.jvtest.util;

public class PasswordUtil {

    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String Password){
        return SecurityLevel.WEAK;
    }


}
