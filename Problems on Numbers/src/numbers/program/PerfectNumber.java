package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 * 
 * 
 *         Date -15/10/2020
 * 
 *         Perfect Number ----------------- - The number is call perfect number
 *         if and only number is same as multiple of that number and addition of
 *         the multiple
 * 
 *         - 6 = 1*2*3=6 and 1+2+3 = 6
 *
 */
public class PerfectNumber {
	Scanner input = new Scanner(System.in);
	int num, value = 0;

	/**
	 * Taking input from user
	 */
	void input() {
		System.out.println("Enter The Number");
		num = input.nextInt();
	}

	/**
	 * Logic for Perfect Number
	 */
	void logic() {
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				value = value + i;
			}
		}
	}

	void output() {

		if (value == num) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not Perfect Number");
		}
	}

	/**
	 * @param args
	 * 
	 *             Main method is the key here program start execution
	 * 
	 */
	public static void main(String[] args) {
		PerfectNumber object = new PerfectNumber();
		object.input();
		object.logic();
		object.output();
	}
}
