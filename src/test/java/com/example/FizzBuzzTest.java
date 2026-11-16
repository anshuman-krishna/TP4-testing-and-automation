package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private final FizzBuzz FizzBuzz = new FizzBuzz();
    
    @Test
    public void test1Returns1() {
        assertEquals("1", FizzBuzz.convert(1));
    }

    @Test
    public void test2Returns2() {
        assertEquals("2", FizzBuzz.convert(2));
    }

    @Test
    public void test3ReturnsFizz() {
        assertEquals("Fizz", FizzBuzz.convert(3));
    }

    @Test
    public void test5ReturnsBuzz() {
        assertEquals("Buzz", FizzBuzz.convert(5));
    }

    @Test
    public void test15ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.convert(15));
    }

    @Test
    public void test30ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.convert(30));
    }
}
