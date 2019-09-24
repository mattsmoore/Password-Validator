package com.example.password_validator;

/* Matthew Moore
    B00767194

 Tests for Validation methods

 */


import org.junit.Test;

import static com.example.password_validator.Validator.basicValidator;
import static com.example.password_validator.Validator.complexValidator;
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
        // Tests if the password passes basic validator
        int x = basicValidator("test1test1test");
        assertEquals(0,x);
    }

    @Test
    public void specialCharacter(){
        // Tests if the string has no special character
        int x = complexValidator("Thisword123");
        assertEquals(1,x);
    }

    @Test
    public void noSpecialCharacterNoCapital(){
        // Tests if the string has no capital and no special character
        int x = complexValidator("thisword123");
        assertEquals(2,x);
    }

    @Test
    public void Number(){
        // Tests if the string has no number
        int x = complexValidator("Thisword*jjj");
        assertEquals(1,x);
    }

    @Test
    public void Capital(){
        // Tests if the string has no capital
        int x = complexValidator("thisword23*");
        assertEquals(1,x);
    }





}
