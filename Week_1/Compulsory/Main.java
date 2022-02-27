package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!!! Tab says hi!");

        String[] languages = new String[]{"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        Number n=new Number();
        System.out.println("Numarul random generat este: " + n.getValue());

        n.multiplyByX(3);
        System.out.println("Numarul dupa inmultirea cu 3 este: " + n.getValue());

        n.addBinary("10101");
        System.out.println("Numarul dupa adunarea cu <10101> este: " + n.getValue());

        n.addHexa("FF");
        System.out.println("Numarul dupa adunarea cu <FF> este: " + n.getValue());

        n.multiplyByX(6);
        System.out.println("Numarul dupa inmultirea cu 6 este: " + n.getValue());

        n.sumDigits();
        System.out.println("Suma cifrelor este:" + n.getSumDigits() );

        System.out.println("Willy-nilly, this semester I will learn");
        System.out.println(languages[n.getSumDigits()]);
    }
}
