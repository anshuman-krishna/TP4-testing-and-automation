package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    public void testNumbersReturnThemselves(int number) {
        assertEquals(String.valueOf(number), fizzBuzz.convert(number), number + " should return " + number);
    }

    @ParameterizedTest
    @ValueSource(ints = {3})
    public void testMultiplesOf3ReturnFizz(int number) {
        assertEquals("Fizz", fizzBuzz.convert(number), number + " should return Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5})
    public void testMultiplesOf5ReturnBuzz(int number) {
        assertEquals("Buzz", fizzBuzz.convert(number), number + " should return Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    public void testMultiplesOf3And5ReturnFizzBuzz(int number) {
        assertEquals("FizzBuzz", fizzBuzz.convert(number), number + " should return FizzBuzz");
    }
}
