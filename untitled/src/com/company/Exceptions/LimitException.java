package com.company.Exceptions;

public class LimitException extends Exception {
    public LimitException(String message){
        // ვიძახებთ Exception კლასის კონსტრუქტორს
        super(message);
    }
}