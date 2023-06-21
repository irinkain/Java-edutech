package com.company.StringOperations;


import com.company.Exceptions.Circle;
import com.company.Exceptions.LimitException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws LimitException {
        // object initialization
        String s = new String();

        // literal initialization
        String sLiteral = "something";
        //sLiteral = sLiteral.substring(0, 2);
        String sLiteral2 = "something";
        Character character = 'c';
        Character character2 = 'c';
        Integer int1 = 1;
        Integer int2 = 1;

        Circle c1 = new Circle(12);
        Circle c2 = new Circle(12);

//        System.out.println(c1 == c2); // false
//        System.out.println(int1.equals(int2)); // true
//        System.out.println(sLiteral == sLiteral2); // true
//        System.out.println(character == character2); // true

        String sentence = "I AM ALIVE";
        char[] sentenceArray = sentence.toCharArray();
        for (char c: sentenceArray
             ) {
            System.out.println(c);
        }



        String sentence2 = "I AM ALIvE";
//        System.out.println(sentence.toLowerCase());
//        System.out.println(sentence2.toUpperCase());

        // from array of chars
        char[] chars = {'t', 'b', 'p'};
        String sentenceFromArray = new String(chars);
        System.out.println(sentenceFromArray);



        // length
        int lengthOfSentence = sentence.length(); // 11

        // concatenation
        System.out.println(sentence + sentenceFromArray);

        // equals
        System.out.println(sentence.equals(sentence2));
        System.out.println(sentence.equalsIgnoreCase(sentence2));

        // startsWith
        System.out.println(sentence.startsWith("I AM "));

        // indexOf
        System.out.println(sentence.indexOf("I"));

        // find all indexes of given char
        for (int i = 0; i < sentence.toCharArray().length; i++) {
            if (sentence.toCharArray()[i] == 'I') {
                System.out.println(i);
            }
        }

        // substring
        System.out.println(sentence.substring(3));
        System.out.println(sentence.substring(3, 5));
        System.out.println(sentence.substring(sentence.lastIndexOf("I")));
        System.out.println(sentence.substring(sentence.length() - 1)); // last element


        // split
        String bigSentence = "I am a java program and i've arrived to destroy c#";
        String sent = " I,Am,Irina,Inashvili";
        String[] strArray1 = sent.trim().replace(" ","").split(",");
        for (String str :
                strArray1) {
            System.out.println(str);
        }
        String[] strArray = bigSentence.split("([D-Z])\\w+");
        for (String str :
                strArray) {
            System.out.println(str);
        }

        // contains
        System.out.println(bigSentence.compareToIgnoreCase("I am A java program and i've arrived to destroy c#"));
        System.out.println(bigSentence.contains("java"));

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(32);
        stringBuilder.append('g');

        String toBeAppended = ";Hello";
        if (toBeAppended.contains(";")) {
            toBeAppended = toBeAppended.replace(";", " ");
            // Hello
            stringBuilder.append(toBeAppended);
        }

        System.out.println(stringBuilder);


        String name = "Tazoooooooooooooooooooooooo studing Java";
        System.out.println(name.toUpperCase().endsWith("TAZ"));
        String phonematcher = "(555-\\d{3}-\\d{3})";
        Pattern pattern = Pattern.compile(phonematcher);
        String number = "555-888-777";
        Matcher matcher = pattern.matcher(number);
        if(matcher.find()){
            System.out.println("fiiiind");
        }
        else {
            System.out.println(" :( ");
        }

    }
}