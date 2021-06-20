package com.pruthvi.java.ClassAndObjects;

public class java_Recursion {
	int factorial_num(int n) {
		if (n == 0 || n == 1)
			return n; // NOTE :need remember exit condition in recursion
		return factorial_num(n - 1) + factorial_num(n - 2);
	}

}
