package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        if((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if(number % 5 == 0) {
            return "Buzz";
        } else if(number % 7 == 0){
            return "Wizz";
        } else if(number % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }
}