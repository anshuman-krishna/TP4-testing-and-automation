package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test1Returns1() {
        assertEquals("1", fizzBuzz.convert(1), "1 should return 1");
    }

    @Test
    public void test2Returns2() {
        assertEquals("2", fizzBuzz.convert(2), "2 should return 2");
    }

    @Test
    public void test3ReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.convert(3), "3 should return Fizz");
    }

    @Test
    public void test5ReturnsBuzz() {
        assertEquals("Buzz", fizzBuzz.convert(5), "5 should return Buzz");
    }

    @Test
    public void test15ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.convert(15), "15 should return FizzBuzz");
    }

    @Test
    public void test30ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.convert(30), "30 should return FizzBuzz");
    }
}
