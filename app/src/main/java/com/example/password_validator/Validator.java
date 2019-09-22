package com.example.password_validator;

class Validator {

    static int basicValidator(String s){

        int rules = 0;

        if(!s.matches(".{8,}")){
            rules++;
        }
        if(s.toLowerCase().matches("(password)")){
            rules++;
        }

        return rules;

    }


    static int complexValidator(String s){

        int rules = 0;


        if(!s.matches(".{8,}")){
            rules++;
        }
        if(s.toLowerCase().matches("(password)")){
            rules++;
        }
        if(!s.matches(".*[0-9].*")){
            rules++;
        }
        if(!s.matches(".*[!@#$%^&*(),.?\":{}|<>].*")){
            rules++;
        }
        if(!s.matches(".*[A-Z]+.*")){
            rules++;
        }

        return rules;

    }
}
