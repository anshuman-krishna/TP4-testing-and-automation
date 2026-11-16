package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void test0IsNotPrime() {
        assertFalse(primeChecker.isPrime(0), "0 should not be considered a prime number");
    }

    @Test
    public void test1IsNotPrime() {
        assertFalse(primeChecker.isPrime(1), "1 should not be considered a prime number");
    }

    @Test
    public void test2IsPrime() {
        assertTrue(primeChecker.isPrime(2), "2 should be considered a prime number");
    }

    @Test
    public void test3IsPrime() {
        assertTrue(primeChecker.isPrime(3), "3 should be considered a prime number");
    }

    @Test
    public void test4IsNotPrime() {
        assertFalse(primeChecker.isPrime(4), "4 should not be considered a prime number");
    }

    @Test
    public void test5IsPrime() {
        assertTrue(primeChecker.isPrime(5), "5 should be considered a prime number");
    }

    @Test
    public void test6IsNotPrime() {
        assertFalse(primeChecker.isPrime(6), "6 should not be considered a prime number");
    }

    @Test
    public void test7IsPrime() {
        assertTrue(primeChecker.isPrime(7), "7 should be considered a prime number");
    }

    @Test
    public void test8IsNotPrime() {
        assertFalse(primeChecker.isPrime(8), "8 should not be considered a prime number");
    }

    @Test
    public void test9IsNotPrime() {
        assertFalse(primeChecker.isPrime(9), "9 should not be considered a prime number");
    }

    @Test
    public void test10IsNotPrime() {
        assertFalse(primeChecker.isPrime(10), "10 should not be considered a prime number");
    }

    @Test
    public void test11IsPrime() {
        assertTrue(primeChecker.isPrime(11), "11 should be considered a prime number");
    }

    @Test
    public void test12IsNotPrime() {
        assertFalse(primeChecker.isPrime(12), "12 should not be considered a prime number");
    }

    @Test
    public void test13IsPrime() {
        assertTrue(primeChecker.isPrime(13), "13 should be considered a prime number");
    }

    @Test
    public void test14IsNotPrime() {
        assertFalse(primeChecker.isPrime(14), "14 should not be considered a prime number");
    }

    @Test
    public void test15IsNotPrime() {
        assertFalse(primeChecker.isPrime(15), "15 should not be considered a prime number");
    }

    @Test
    public void test16IsNotPrime() {
        assertFalse(primeChecker.isPrime(16), "16 should not be considered a prime number");
    }

    @Test
    public void test17IsPrime() {
        assertTrue(primeChecker.isPrime(17), "17 should be considered a prime number");
    }

    @Test
    public void test18IsNotPrime() {
        assertFalse(primeChecker.isPrime(18), "18 should not be considered a prime number");
    }

    @Test
    public void test19IsPrime() {
        assertTrue(primeChecker.isPrime(19), "19 should be considered a prime number");
    }

    @Test
    public void test20IsNotPrime() {
        assertFalse(primeChecker.isPrime(20), "20 should not be considered a prime number");
    }

    @Test
    public void test21IsNotPrime() {
        assertFalse(primeChecker.isPrime(21), "21 should not be considered a prime number");
    }

    @Test
    public void test22IsNotPrime() {
        assertFalse(primeChecker.isPrime(22), "22 should not be considered a prime number");
    }

    @Test
    public void test23IsPrime() {
        assertTrue(primeChecker.isPrime(23), "23 should be considered a prime number");
    }

    @Test
    public void test24IsNotPrime() {
        assertFalse(primeChecker.isPrime(24), "24 should not be considered a prime number");
    }

    @Test
    public void test25IsNotPrime() {
        assertFalse(primeChecker.isPrime(25), "25 should not be considered a prime number");
    }

    @Test
    public void test26IsNotPrime() {
        assertFalse(primeChecker.isPrime(26), "26 should not be considered a prime number");
    }

    @Test
    public void test27IsNotPrime() {
        assertFalse(primeChecker.isPrime(27), "27 should not be considered a prime number");
    }

    @Test
    public void test28IsNotPrime() {
        assertFalse(primeChecker.isPrime(28), "28 should not be considered a prime number");
    }

    @Test
    public void test29IsPrime() {
        assertTrue(primeChecker.isPrime(29), "29 should be considered a prime number");
    }

    @Test
    public void test30IsNotPrime() {
        assertFalse(primeChecker.isPrime(30), "30 should not be considered a prime number");
    }

    @Test
    public void test31IsPrime() {
        assertTrue(primeChecker.isPrime(31), "31 should be considered a prime number");
    }

    @Test
    public void test32IsNotPrime() {
        assertFalse(primeChecker.isPrime(32), "32 should not be considered a prime number");
    }

    @Test
    public void test33IsNotPrime() {
        assertFalse(primeChecker.isPrime(33), "33 should not be considered a prime number");
    }

    @Test
    public void test34IsNotPrime() {
        assertFalse(primeChecker.isPrime(34), "34 should not be considered a prime number");
    }

    @Test
    public void test35IsNotPrime() {
        assertFalse(primeChecker.isPrime(35), "35 should not be considered a prime number");
    }

    @Test
    public void test36IsNotPrime() {
        assertFalse(primeChecker.isPrime(36), "36 should not be considered a prime number");
    }

    @Test
    public void test37IsPrime() {
        assertTrue(primeChecker.isPrime(37), "37 should be considered a prime number");
    }

    @Test
    public void test38IsNotPrime() {
        assertFalse(primeChecker.isPrime(38), "38 should not be considered a prime number");
    }

    @Test
    public void test39IsNotPrime() {
        assertFalse(primeChecker.isPrime(39), "39 should not be considered a prime number");
    }

    @Test
    public void test40IsNotPrime() {
        assertFalse(primeChecker.isPrime(40), "40 should not be considered a prime number");
    }

    @Test
    public void test41IsPrime() {
        assertTrue(primeChecker.isPrime(41), "41 should be considered a prime number");
    }

    @Test
    public void test42IsNotPrime() {
        assertFalse(primeChecker.isPrime(42), "42 should not be considered a prime number");
    }

    @Test
    public void test43IsPrime() {
        assertTrue(primeChecker.isPrime(43), "43 should be considered a prime number");
    }

    @Test
    public void test44IsNotPrime() {
        assertFalse(primeChecker.isPrime(44), "44 should not be considered a prime number");
    }

    @Test
    public void test45IsNotPrime() {
        assertFalse(primeChecker.isPrime(45), "45 should not be considered a prime number");
    }

    @Test
    public void test46IsNotPrime() {
        assertFalse(primeChecker.isPrime(46), "46 should not be considered a prime number");
    }

    @Test
    public void test47IsPrime() {
        assertTrue(primeChecker.isPrime(47), "47 should be considered a prime number");
    }

    @Test
    public void test48IsNotPrime() {
        assertFalse(primeChecker.isPrime(48), "48 should not be considered a prime number");
    }

    @Test
    public void test49IsNotPrime() {
        assertFalse(primeChecker.isPrime(49), "49 should not be considered a prime number");
    }

    @Test
    public void test50IsNotPrime() {
        assertFalse(primeChecker.isPrime(50), "50 should not be considered a prime number");
    }

    @Test
    public void test51IsNotPrime() {
        assertFalse(primeChecker.isPrime(51), "51 should not be considered a prime number");
    }

    @Test
    public void test52IsNotPrime() {
        assertFalse(primeChecker.isPrime(52), "52 should not be considered a prime number");
    }

    @Test
    public void test53IsPrime() {
        assertTrue(primeChecker.isPrime(53), "53 should be considered a prime number");
    }

    @Test
    public void test54IsNotPrime() {
        assertFalse(primeChecker.isPrime(54), "54 should not be considered a prime number");
    }

    @Test
    public void test55IsNotPrime() {
        assertFalse(primeChecker.isPrime(55), "55 should not be considered a prime number");
    }

    @Test
    public void test56IsNotPrime() {
        assertFalse(primeChecker.isPrime(56), "56 should not be considered a prime number");
    }

    @Test
    public void test57IsNotPrime() {
        assertFalse(primeChecker.isPrime(57), "57 should not be considered a prime number");
    }

    @Test
    public void test58IsNotPrime() {
        assertFalse(primeChecker.isPrime(58), "58 should not be considered a prime number");
    }

    @Test
    public void test59IsPrime() {
        assertTrue(primeChecker.isPrime(59), "59 should be considered a prime number");
    }

    @Test
    public void test60IsNotPrime() {
        assertFalse(primeChecker.isPrime(60), "60 should not be considered a prime number");
    }

    @Test
    public void test61IsPrime() {
        assertTrue(primeChecker.isPrime(61), "61 should be considered a prime number");
    }

    @Test
    public void test62IsNotPrime() {
        assertFalse(primeChecker.isPrime(62), "62 should not be considered a prime number");
    }

    @Test
    public void test63IsNotPrime() {
        assertFalse(primeChecker.isPrime(63), "63 should not be considered a prime number");
    }

    @Test
    public void test64IsNotPrime() {
        assertFalse(primeChecker.isPrime(64), "64 should not be considered a prime number");
    }

    @Test
    public void test65IsNotPrime() {
        assertFalse(primeChecker.isPrime(65), "65 should not be considered a prime number");
    }

    @Test
    public void test66IsNotPrime() {
        assertFalse(primeChecker.isPrime(66), "66 should not be considered a prime number");
    }

    @Test
    public void test67IsPrime() {
        assertTrue(primeChecker.isPrime(67), "67 should be considered a prime number");
    }

    @Test
    public void test68IsNotPrime() {
        assertFalse(primeChecker.isPrime(68), "68 should not be considered a prime number");
    }

    @Test
    public void test69IsNotPrime() {
        assertFalse(primeChecker.isPrime(69), "69 should not be considered a prime number");
    }

    @Test
    public void test70IsNotPrime() {
        assertFalse(primeChecker.isPrime(70), "70 should not be considered a prime number");
    }

    @Test
    public void test71IsPrime() {
        assertTrue(primeChecker.isPrime(71), "71 should be considered a prime number");
    }

    @Test
    public void test72IsNotPrime() {
        assertFalse(primeChecker.isPrime(72), "72 should not be considered a prime number");
    }

    @Test
    public void test73IsPrime() {
        assertTrue(primeChecker.isPrime(73), "73 should be considered a prime number");
    }

    @Test
    public void test74IsNotPrime() {
        assertFalse(primeChecker.isPrime(74), "74 should not be considered a prime number");
    }

    @Test
    public void test75IsNotPrime() {
        assertFalse(primeChecker.isPrime(75), "75 should not be considered a prime number");
    }

    @Test
    public void test76IsNotPrime() {
        assertFalse(primeChecker.isPrime(76), "76 should not be considered a prime number");
    }

    @Test
    public void test77IsNotPrime() {
        assertFalse(primeChecker.isPrime(77), "77 should not be considered a prime number");
    }

    @Test
    public void test78IsNotPrime() {
        assertFalse(primeChecker.isPrime(78), "78 should not be considered a prime number");
    }

    @Test
    public void test79IsPrime() {
        assertTrue(primeChecker.isPrime(79), "79 should be considered a prime number");
    }

    @Test
    public void test80IsNotPrime() {
        assertFalse(primeChecker.isPrime(80), "80 should not be considered a prime number");
    }

    @Test
    public void test81IsNotPrime() {
        assertFalse(primeChecker.isPrime(81), "81 should not be considered a prime number");
    }

    @Test
    public void test82IsNotPrime() {
        assertFalse(primeChecker.isPrime(82), "82 should not be considered a prime number");
    }

    @Test
    public void test83IsPrime() {
        assertTrue(primeChecker.isPrime(83), "83 should be considered a prime number");
    }

    @Test
    public void test84IsNotPrime() {
        assertFalse(primeChecker.isPrime(84), "84 should not be considered a prime number");
    }

    @Test
    public void test85IsNotPrime() {
        assertFalse(primeChecker.isPrime(85), "85 should not be considered a prime number");
    }

    @Test
    public void test86IsNotPrime() {
        assertFalse(primeChecker.isPrime(86), "86 should not be considered a prime number");
    }

    @Test
    public void test87IsNotPrime() {
        assertFalse(primeChecker.isPrime(87), "87 should not be considered a prime number");
    }

    @Test
    public void test88IsNotPrime() {
        assertFalse(primeChecker.isPrime(88), "88 should not be considered a prime number");
    }

    @Test
    public void test89IsPrime() {
        assertTrue(primeChecker.isPrime(89), "89 should be considered a prime number");
    }

    @Test
    public void test90IsNotPrime() {
        assertFalse(primeChecker.isPrime(90), "90 should not be considered a prime number");
    }

    @Test
    public void test91IsNotPrime() {
        assertFalse(primeChecker.isPrime(91), "91 should not be considered a prime number");
    }

    @Test
    public void test92IsNotPrime() {
        assertFalse(primeChecker.isPrime(92), "92 should not be considered a prime number");
    }

    @Test
    public void test93IsNotPrime() {
        assertFalse(primeChecker.isPrime(93), "93 should not be considered a prime number");
    }

    @Test
    public void test94IsNotPrime() {
        assertFalse(primeChecker.isPrime(94), "94 should not be considered a prime number");
    }

    @Test
    public void test95IsNotPrime() {
        assertFalse(primeChecker.isPrime(95), "95 should not be considered a prime number");
    }

    @Test
    public void test96IsNotPrime() {
        assertFalse(primeChecker.isPrime(96), "96 should not be considered a prime number");
    }

    @Test
    public void test97IsPrime() {
        assertTrue(primeChecker.isPrime(97), "97 should be considered a prime number");
    }

    @Test
    public void test98IsNotPrime() {
        assertFalse(primeChecker.isPrime(98), "98 should not be considered a prime number");
    }

    @Test
    public void test99IsNotPrime() {
        assertFalse(primeChecker.isPrime(99), "99 should not be considered a prime number");
    }

    @Test
    public void test100IsNotPrime() {
        assertFalse(primeChecker.isPrime(100), "100 should not be considered a prime number");
    }
}
