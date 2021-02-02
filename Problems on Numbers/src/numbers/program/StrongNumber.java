package numbers.program;

import java.util.Scanner;

/**
 * @author feel
 * 
 *         Date - 15/10/2020
 * 
 *         Strong Number ----------------
 * 
 *         - a number whose sum of all digits' factorial is equal to the number
 * 
 *         Ex - 145 = 1*1 + 4*4 + 5*5 = 145
 *
 */
public class StrongNumber {
	Scanner input = new Scanner(System.in);
	int num, temp, rem, sum = 0, fact;

	void input() {
		System.out.println("Enter The Number");
		num = input.nextInt();
		temp = num;
	}

	/**
	 * Logic Number For Strong Number
	 */
	void logic() {
		while (num > 0) {
			rem = num % 10;
			fact = 1;
			for (int i = rem; i >= 1; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;
		}
	}

	/**
	 * 
	 */
	void output() {
		num = temp;
		if (sum == num) {
			System.out.println("It is a Strong Number");
		} else {
			System.out.println("Not a Strong Number");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StrongNumber obj = new StrongNumber();
		obj.input();
		obj.logic();
		obj.output();
	}
}
