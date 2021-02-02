package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 *
 *         Date - 16/10/2020
 * 
 * 
 *         Multiple Of Number -----------------------------
 * 
 *         -
 * 
 * 
 *
 */
public class MultipleOfNumber {
	Scanner input = new Scanner(System.in);
	int num;

	/**
	 * Taking input
	 */
	void input() {
		System.out.println("Enter The Number");
		num = input.nextInt();
	}

	/**
	 * Logic for Multiple Of Number
	 */
	void logic() {
		System.out.println("Multiple Of Number are:-");
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultipleOfNumber obj = new MultipleOfNumber();
		obj.input();
		obj.logic();
	}
}
