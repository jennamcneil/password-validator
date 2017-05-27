package com.example.jen.password_validator;

/**
 * Created by Jen on 2017-05-27.
 */

public class passwordValidator {
    public int validate1 (String word){
        int error =0;
        //Word less than 8 characters
        if (word.length() < 8 ){
            error++;
        }
        //Word  equals password
        if (word.equalsIgnoreCase("password")){
            error++;
        }

        return error;
    }

}
