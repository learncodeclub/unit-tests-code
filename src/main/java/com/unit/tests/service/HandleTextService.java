package com.unit.tests.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HandleTextService {

    public String numberOfChars(String textToValidate){
        int numberChars = textToValidate.length();
        return "Seu texto tem "+numberChars+" letras!";
    }

    public String getRandomNumber(String name) {
        Random random = new Random();
        return "Olá "+name+" o número aleatório pra você foi: "+ random.nextInt(10);
    }
}
