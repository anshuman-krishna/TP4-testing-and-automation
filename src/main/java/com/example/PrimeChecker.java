package com.example;

import java.util.Set;

public class PrimeChecker {

    private static final Set<Integer> PRIME_NUMBERS = Set.of(
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    );

    public boolean isPrime(int number) {
        if(number > 100) throw new IllegalArgumentException("Numbers above 100 are not accepted");
        return PRIME_NUMBERS.contains(number);
    }
}
// red > run > blue/green edit > run > refactor > repeat