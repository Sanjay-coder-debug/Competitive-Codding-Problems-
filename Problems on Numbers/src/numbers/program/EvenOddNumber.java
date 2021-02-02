package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 * 
 *         Date - 16/10/2020
 *
 */
public class EvenOddNumber {
	Scanner sc = new Scanner(System.in);
	int num;

	void input() {
		System.out.println("Enter The Number");
		num = sc.nextInt();
	}

	void logic() {
		if (num % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		EvenOddNumber obj = new EvenOddNumber();
		obj.input();
		obj.logic();
	}

}
