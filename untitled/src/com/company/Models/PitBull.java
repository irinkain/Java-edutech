package com.company.Models;

public class PitBull extends Dogs{
    public void kill(){
        System.out.println("pitbull can kill people");
    }

//    public void bark(){
//        System.out.println("WHAFF");
//    }

    @Override
    public void bark(){
        System.out.println("PEW");
    }
}