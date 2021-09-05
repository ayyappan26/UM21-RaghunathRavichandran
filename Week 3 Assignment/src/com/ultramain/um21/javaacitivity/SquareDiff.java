package com.ultramain.um21.javaacitivity;

public class SquareDiff {
	public static void main(String[] args) {
		new SquareDiff().calculateDifference(1000);
	}

	public int calculateDifference(int n) {
		int a, b, c;

		a = (n * (n + 1) * (2 * n + 1)) / 6;
		b = (n * (n + 1)) / 2;
		b = b * b;
		c = Math.abs(a - b);
		System.out.println("Difference : " + c);
		return c;

	}
}