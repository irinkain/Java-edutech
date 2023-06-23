package com.company.AbstractClass;

public abstract class SecurityWorker {

    public void secureAction(String user, String password, String action) {

        if (authenticate(user, password)) {

            System.out.println("Performing action \"" + action + "\" as " + user);
        } else System.out.println("Something went wrong");
    }

    protected abstract boolean authenticate(String user, String password);

}
