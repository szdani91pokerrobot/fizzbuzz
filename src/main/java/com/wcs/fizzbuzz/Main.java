package com.wcs.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        for(int i=1; i <= 100; i++) {
            System.out.println(fizzBuzzer.execute(i));
        }
    }
}
