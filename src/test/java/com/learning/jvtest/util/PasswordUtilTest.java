package com.learning.jvtest.util;

import org.junit.Test;

import static com.learning.jvtest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals((WEAK), PasswordUtil.assessPassword("123aa!7"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals((WEAK), PasswordUtil.assessPassword("asdfghj"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals((MEDIUM), PasswordUtil.assessPassword("14as4df43gh2j"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols(){
        assertEquals((STRONG), PasswordUtil.assessPassword("14as4df43gh2!!j"));
    }


}