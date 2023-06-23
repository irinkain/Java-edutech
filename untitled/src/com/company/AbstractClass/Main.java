package com.company.AbstractClass;

public class Main {

    public static void main(String[] args){
        SecurityWorker worker = new HardcodedSecurityWorker();
        worker.secureAction("mikheil", "secret", "shut down");
    }
}
