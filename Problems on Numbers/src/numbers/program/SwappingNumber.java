package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 * 
 *         Date - 16/10/2020
 * 
 *         Swapping of Number -----------------
 * 
 *         - Exchange the Value
 *
 */
public class SwappingNumber {
	Scanner input = new Scanner(System.in);
	int num1, num2, temp;

	void input() {
		System.out.println("Enter The First Number");
		num1 = input.nextInt();
		System.out.println("Enter The Second Number");
		num2 = input.nextInt();
	}

	/**
	 * Logic for Swapping Two Number
	 */
	void logic() {
		temp = num1;
		num1 = num2;
		num2 = temp;
	}

	/**
	 * Output Method
	 */
	void output() {
		System.out.println("----------After Swapping-----------");
		System.out.println("Value Of Num1 " + num1);
		System.out.println("Value Of Num2 " + num2);
	}

	public static void main(String[] args) {
		SwappingNumber obj = new SwappingNumber();
		obj.input();
		obj.logic();
		obj.output();
	}
}
