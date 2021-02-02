package numbers.program;

import java.util.Scanner;

/**
 * @author feel
 * 
 *         Reverse Of Number - 152 - 251
 *
 */
public class ReverseOfNumber {
	Scanner input = new Scanner(System.in);
	int number;
	int rem, rev = 0;

	/**
	 * Taking Input From User
	 */
	public void input() {
		System.out.println("Enter The Number");
		number = input.nextInt();
	}

	/**
	 * Logic for Reverse of a number
	 */
	public void logic() {

		while (number > 0) {
			rem = number % 10;
			rev = rev*10+rem;
			number = number / 10;
		}
		System.out.println("Reverse of Number is = " + rev);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseOfNumber ob = new ReverseOfNumber();
		ob.input();
		ob.logic();
	}

}
