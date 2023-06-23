package com.company.AbstractClass;

public class PaddingSecurityWorker extends HardcodedSecurityWorker {

    public void secureAction(String user, String password, String action) {

        super.secureAction(user, "secretpadding" + password, action);

    } }
