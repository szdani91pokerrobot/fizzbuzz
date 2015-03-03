package com.wcs.fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer;

    @Before
    public void initializeVariables() {
        fizzBuzzer = new FizzBuzzer();
    }

    @Test
    public void executeShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("Fizz", fizzBuzzer.execute(3));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("Buzz", fizzBuzzer.execute(5));
        assertEquals("Buzz", fizzBuzzer.execute(10));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy15() {
        assertEquals("FizzBuzz", fizzBuzzer.execute(15));
        assertEquals("FizzBuzz", fizzBuzzer.execute(30));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
    }

    @Test
    public void shouldReturnWizzOnNumberDivisibleBySeven() {
        assertEquals("Wizz", fizzBuzzer.execute(7));
        assertEquals("Wizz", fizzBuzzer.execute(21));
        assertEquals("Wizz", fizzBuzzer.execute(28));
    }

}
