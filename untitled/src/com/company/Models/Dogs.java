package com.company.Models;

public class Dogs extends Animals {
    private String barkWhat;

    public Animals bark() {
        System.out.println("WHAFF");
        return new Animals();
    }

    public Dogs() {
        super("DOG");
//        this("WHAFF"); // AR SHEIDZLEBAA!!!
    }

    public Dogs(String barkWhat) {
        this.barkWhat = barkWhat;
    }
}
