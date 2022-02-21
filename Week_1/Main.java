package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Family!!! Tab says hi!");

        String[] languages = new String[]{"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n);

        int result=0;
        result = n * 3;

        int binar=10101;
        int number=0;
        int po=0;
        while(binar!=0) {
        number= (int) (number+binar%10 * Math.pow(2, po));;
        po = po+1;
        binar=binar/10;
        }
        System.out.println(number);

        System.out.println("Willy-nilly, this semester I will learn");
        System.out.println(languages[result]);
    }
}
