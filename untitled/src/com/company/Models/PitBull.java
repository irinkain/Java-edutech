package com.company.Models;

public class PitBull extends Dogs{
    public void kill(){
        System.out.println("pitbull can kill people");
    }

//    public void bark(){
//        System.out.println("WHAFF");
//    }

    @Override
    public Dogs bark(){
        System.out.println("PEW");
        return new Dogs();
    }
    public static void main(String[] args) {
        PitBull pt = new PitBull();
        Animals an = new PitBull();
        an.sayHello();
        System.out.println(an instanceof PitBull);
    }
}
