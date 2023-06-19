package com.company.Models;

public class Pudeli extends Dogs {

    @Override
    public PitBull bark() {
        System.out.println("waf waf");
        return new PitBull();
    }
}
