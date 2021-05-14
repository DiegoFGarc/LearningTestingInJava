package com.learning.jvtest.util;

import org.junit.Test;

import static com.learning.jvtest.util.PasswordUtil.SecurityLevel.WEAK;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals((WEAK), PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals((WEAK), PasswordUtil.assessPassword("asdfghj"));
    }

}