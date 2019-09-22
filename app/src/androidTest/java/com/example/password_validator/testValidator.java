package com.example.password_validator;

import org.junit.Test;

import static com.example.password_validator.Validator.basicValidator;
import static junit.framework.TestCase.assertEquals;

public class testValidator {

    @Test
    public void pwName(){
        // Tests the password isn't 'Password' case insensitive
        int x = basicValidator("PaSswOrD");
        assertEquals(1,x);
    }

    @Test
    public void pwShort(){
        // Tests if the password is too short
        int x = basicValidator("hello");
        assertEquals(1,x);
    }

    @Test
    public void pwWorks(){
        // Tests if the password passes validator
        int x = basicValidator("test1test1test");
        assertEquals(0,x);
    }

}
