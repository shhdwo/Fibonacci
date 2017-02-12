package com.capgemini.fibonacci;

import java.math.*;

public class Fibonacci {

	public static BigInteger fib(int n) {
		if (n < 1) throw new IllegalArgumentException();
		else if (n <= 1) return BigInteger.valueOf(n);
		else {
			BigInteger a = BigInteger.valueOf(0);
			BigInteger b = BigInteger.valueOf(1);
			BigInteger fibo = BigInteger.valueOf(0);
			for (int i = 2; i <= n; i++) {
				fibo = a.add(b);
				if (i != n) {
					a = b;
					b = fibo;
				}
			}
			return fibo;
		}
	}

}
