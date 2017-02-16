package com.capgemini.fibonacci;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	/**
	 * Dla n większego od 0 zwracana jest wartosc ciagu n-tego elementu
	 * Dla n mniejszego od 1 lub wiekszego od 100_000 zwracany jest wyjątek
	 * W wersji rekurencyjnej wyjątek jest zwracany już powyżej n 20
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
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAcceptMoreThan_5000_AsArgument() {
		//given
		
		//when
		Fibonacci.fib(100_001);
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
	public void shouldReturn_JustCallItALot_When_50_As_Argument() {
		//given
		
		//when
		BigInteger result = Fibonacci.fib(50);
		//then
		Assert.assertEquals(BigInteger.valueOf(12586269025L), result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAcceptLessThan_1_AsArgumentRECURSIVE() {
		//given
		
		//when
		Fibonacci.fibRecursively(-3);
		//then
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAcceptMoreThan_20_AsArgumentRECURSIVE() {
		//given
		
		//when
		Fibonacci.fibRecursively(21);
		//then
	}
	
	@Test
	public void shouldReturn_1_When_2_As_ArgumentRECURSIVE() {
		//given
		
		//when
		BigInteger result = Fibonacci.fibRecursively(2);
		//then
		Assert.assertEquals(BigInteger.valueOf(1), result);
	}
	
	@Test
	public void shouldReturn_2584_When_18_As_ArgumentRECURSIVE() {
		//given
		
		//when
		BigInteger result = Fibonacci.fibRecursively(18);
		//then
		Assert.assertEquals(BigInteger.valueOf(2584), result);
	}
	
	@Test
	public void shouldReturn_6765_When_50_As_ArgumentRECURSIVE() {
		//given
		
		//when
		BigInteger result = Fibonacci.fibRecursively(20);
		//then
		Assert.assertEquals(BigInteger.valueOf(6765), result);
	}
}
	
