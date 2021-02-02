package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 * 
 *         Date - 15/10/2020
 *
 *         PalindromeNumber
 * 
 *         -Input-121 Reverse = 121 then Reverse number is Same as Input
 *
 */
public class PalindromeOfNumber {
	Scanner input = new Scanner(System.in);
	int num, rev, rem, temp;

	/**
	 * Taking Input From User
	 */
	void input() {
		System.out.println("Enter The Number");
		num = input.nextInt();
		temp = num;
	}

	/**
	 * Logic for Palindrome Number
	 */
	void logic() {
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
	}

	void output() {
		num = temp;
		if (rev == num) {
			System.out.println("It Is a Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}

	}

	public static void main(String[] args) {
		PalindromeOfNumber object = new PalindromeOfNumber();
		object.input();
		object.logic();
		object.output();
	}
}
