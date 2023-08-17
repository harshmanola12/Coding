package dsa.questions;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int number = sc.nextInt();
			int h =countDigit(number);
			System.out.println("Digit  "+h);
		}
	}

	private static int countDigit(int n) {
		int i = 0;
		while (n > 0) {
			n = n / 10;
			i++;
		}
		return i;
	}
}
