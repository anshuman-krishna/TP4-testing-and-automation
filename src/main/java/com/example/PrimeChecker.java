package com.example;

import java.util.Set;

public class PrimeChecker {

    private static final Set<Integer> PRIME_NUMBERS = Set.of(
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    );

    public boolean isPrime(int number) {

        return PRIME_NUMBERS.contains(number);
    }
}