package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        if (number % 3 == 0) {
            return "fizz";
        } else if(number % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
