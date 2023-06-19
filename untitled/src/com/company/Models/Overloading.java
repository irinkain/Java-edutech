package com.company.Models;

public class Overloading {
    public static int printSomething(int...ids){
//        System.out.println("This method prints a number: " + number);
        for (int id :
                ids) {
            System.out.println(id);
        }
        return ids[1];
    }

    public static void printSomething(String parameter, int number){
        char[] charArray = parameter.toCharArray();
        for (char character :
                charArray) {
            System.out.println(character);
        }
    }

    public static void main(String[] args) {
      printSomething("IRINA",1);
        int methodResult2 = printSomething(1, 2, 3,5);
        Animals animal = new Animals("something");
      //  System.out.println(Animals.nameStatic);
//        Cats animalCat = new Animals(); // AR SHEIDZLEBAAA
        Animals animalCat = new Cats();
    }
    void doSomething(){
        System.out.println("Hello");
    }
    int doSomething(int value){
        return value;
    }
    void doSomething(int first, long second){
        System.out.println(first + " " + second);
    }
    void doSomething(long first, int second){
        System.out.println(first + " " + second);
    }
    String doSometing(String value){
        return value;
    }

}
