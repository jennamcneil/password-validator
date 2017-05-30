package com.example.jen.password_validator;

/**
 * Created by Jen on 2017-05-27.
 */

public class passwordValidator {
    private String password;

    public void setWord(String word){
password= word;
    }
    public String getWord(){
        return password;
    }


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
    public int validate2(String word){
        int error =0;
        //Word contains number
        if(word.matches(".*\\d.*")){
        }
        else {
            error++;
        }
        //Check if contains both case letters
        if (word.equals(word.toLowerCase())||word.equals(word.toUpperCase())){
            error++;
        }
        //Check if does not contain alphaumeric character
        if (word.matches("[A-Za-z0-9 ]*")){
            error++;
        }
        return error;
    }


}
