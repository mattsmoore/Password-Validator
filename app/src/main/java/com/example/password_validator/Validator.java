package com.example.password_validator;

class Validator {

    // basic validator
    static int basicValidator(String s){

        int rules = 0;

        // at least 8 characters long
        if(!s.matches(".{8,}")){
            rules++;
        }

        // is not a variation of the word "Password"
        if(s.toLowerCase().matches("(password)")){
            rules++;
        }



        return rules;

    }


    static int complexValidator(String s){

        int rules = 0;


        // is more than 8 characters long
        if(!s.matches(".{8,}")){
            rules++;
        }

        // is not a variation of the word "Password"
        if(s.toLowerCase().matches("password")){
            rules++;
        }

        // contains at least one number
        if(!s.matches(".*[0-9].*")){
            rules++;
        }

        // contains at least one special character
        if(!s.matches(".*[!@#$%^&*(),.?\":{}|<>].*")){
            rules++;
        }

        // contains at least one capital letter
        if(!s.matches(".*[A-Z]+.*")){
            rules++;
        }

        return rules;

    }
}
