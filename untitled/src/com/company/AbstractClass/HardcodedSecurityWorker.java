package com.company.AbstractClass;

public class HardcodedSecurityWorker extends SecurityWorker {

// აბსტრაქტული მეთოდის რეალიზაცია შვილ კლასში

    protected boolean authenticate(String user, String password) {

        return "mikheil".equals(user) && "secret".equals(password); } }
