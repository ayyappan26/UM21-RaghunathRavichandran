package com.ultramain.um21.javaacitivity;

public class NaturalNumbers {
	public static void main(String[] args) {
		new NaturalNumbers().calculateSum(10);

	}

	public int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				System.out.println("Sum : " + sum);
			}

		}
		return sum;

	}
}