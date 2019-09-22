package com.example.password_validator;

class Validator {

    static int pwValidator(String s){

        int rules = 0;

        if(s.length() < 8){
            rules++;
        }
        if(s.toLowerCase().equals("password")){
            rules++;
        }

        return rules;


    }
}
