package com.svs.tautologies;

/**
 * Demo of how to avoid tautologies in testing.
 *
 * @author baike
 */
class NumberValidator {
    boolean isItPrime(int number) {
        int maxDivisor = (int) Math.sqrt(number);
        for (int i = 2; i <= maxDivisor; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
