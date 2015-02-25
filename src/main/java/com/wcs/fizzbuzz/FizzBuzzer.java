package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public static void main(String[] args) {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        for(int i=1; i <= 100; i++) {
            System.out.println(fizzBuzzer.execute(i));
        }
    }
    
    public String execute(int number) {
        if((number % 3 == 0) && (number % 5 == 0)) {
            return "fizzbuzz";
        } else if(number % 5 == 0) {
            return "buzz";
        } else if(number % 3 == 0){
            return "fizz";
        } else {
            return String.valueOf(number);
        }
    }
}
