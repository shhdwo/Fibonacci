package com.capgemini.fibonacci;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	/**
	 * Klasa Fibonnacci implementuje metode fib, 
	 * ktora zwraca wartosc n-tego elementu ciagu Fibonacciego
	 * gdzie n jest podawany w argumencie metody
	 * 
	 * 
	 * Dla n większego od 0 zwracana jest wartosc ciagu n-tego elementu
	 * Dla n mniejszego od 1 zwracany jest wyjątek
	 */
	
	
	@Before
	public void setup() {
		new Fibonacci();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAcceptLessThan_1_AsArgument() {
		//given
		
		//when
		Fibonacci.fib(-3);
		//then
	}
	
	@Test
	public void shouldReturn_1_When_2_As_Argument() {
		//given
		
		//when
		BigInteger result = Fibonacci.fib(2);
		//then
		Assert.assertEquals(BigInteger.valueOf(1), result);
	}
	
	@Test
	public void shouldReturn_2584_When_18_As_Argument() {
		//given
		
		//when
		BigInteger result = Fibonacci.fib(18);
		//then
		Assert.assertEquals(BigInteger.valueOf(2584), result);
	}
	
	@Test
	public void shouldReturn_JustCallItALot_When_1500_As_Argument() {
		//given
		
		//when
		BigInteger result = Fibonacci.fib(50);
		//then
		Assert.assertEquals(BigInteger.valueOf(12586269025L), result);
	}
}
	
