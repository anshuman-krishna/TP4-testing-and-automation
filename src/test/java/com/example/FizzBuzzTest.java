package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private final FizzBuzz FizzBuzz = new FizzBuzz();
    
    @Test
    public void test1Returns1() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void test2Returns2() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    public void test3ReturnsFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void test5ReturnsBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void test15ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void test30ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));

    }
}
