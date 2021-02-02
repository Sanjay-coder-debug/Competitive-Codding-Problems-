package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 * 
 *         Table of Number -multiplication of given number with 1 to 10
 */
public class TableOfNumber {
	Scanner input = new Scanner(System.in);
	int number;
	int table = 1;

	/**
	 * Taking input from user
	 */
	public void input() {
		System.out.println("Enter Number ");
		number = input.nextInt();
	}

	/**
	 * Logic for Table of Number
	 */
	public void logic() {
		System.out.println("Table of " + number);
		System.out.println("-----------------");
		for (int i = 1; i <= 10; i++) {
			table = number * i;
			System.out.println(+number + "*" + i + "=" + table);
		}
	}

	public static void main(String[] args) {
		TableOfNumber object = new TableOfNumber();
		object.input();
		object.logic();
	}

}
