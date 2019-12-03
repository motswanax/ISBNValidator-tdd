package com.svs.tautologies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberValidatorTest {
    private NumberValidator validator;

    @Before
    public void setup() {
        validator = new NumberValidator();
    }

   /* @Test
	public void checkPrimeNumbers()
	{

		Integer numbers[] = {1,15,23,25,60,61,63,79,207};
		NumberValidator validator = new NumberValidator();

		for (int i = 0; i < numbers.length; i++) {
			boolean isPrime = true;
			int maxDivisor = (int)Math.sqrt(numbers[i]);
			for(int counter =2;counter < maxDivisor; counter ++) {
		        if(numbers[i] % counter ==0)
		        	isPrime = false;
		    }

		assertEquals(isPrime, validator.isItPrime(numbers[i]));

		}

	}*/

   @Test
    public void checkPrimeNumbers() {
       Integer[] numbers = {1, 23, 61, 79};

       for (Integer number : numbers) {
           assertTrue(validator.isItPrime(number));
       }
   }

   @Test
    public void checkNonPrimeNumbers() {
       Integer[] numbers = {15, 25, 60, 63, 207};

       for (Integer number : numbers) {
           assertFalse(validator.isItPrime(number));
       }
   }
}