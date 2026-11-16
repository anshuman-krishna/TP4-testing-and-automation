package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class RomanNumeralsTests {

    private final RomanNumerals romanNumerals = new RomanNumerals();

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "9, IX",
            "10, X"
    })
    void convertsBasicNumbers(int number, String expected) {
        assertEquals(expected, romanNumerals.convert(number));
    }

    @ParameterizedTest
    @MethodSource("numbersFromOneToThousand")
    void convertsEveryNumberFromOneToThousand(int number, String expected) {
        assertEquals(expected, romanNumerals.convert(number));
    }

    private static Stream<Arguments> numbersFromOneToThousand() {
        return IntStream.rangeClosed(1, 1000)
                .mapToObj(number -> Arguments.of(number, expectedRomanNumeral(number)));
    }

    private static String expectedRomanNumeral(int number) {
        String[] thousands = {"", "M"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[number / 1000]
                + hundreds[(number % 1000) / 100]
                + tens[(number % 100) / 10]
                + ones[number % 10];
    }
}
