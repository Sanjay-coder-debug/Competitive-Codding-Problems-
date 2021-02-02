package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 * 
 *         Date - 15/10/2020
 * 
 *         Factorial of a Number - means - Factorial of 5=1*2*3*4*5 =120
 *
 */
public class FactorialOfNumber {

	Scanner input = new Scanner(System.in);
//	Declaring global variable because we can access any where in this class
	int number;
	int fact = 1;

	/**
	 * Taking input from User
	 */
	public void input() {
		System.out.println("Enter The Number");
		number = input.nextInt();
	}

	/**
	 * Logic for factorial of number
	 */
	public void logic() {

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}

	}

	/**
	 * Display the output of factorial number program
	 */
	public void display() {
		System.out.println("Factorial of " + number + " = " + fact);
	}

	public static void main(String[] args) {

		FactorialOfNumber obj = new FactorialOfNumber();
		obj.input();
		obj.logic();
		obj.display();
	}
}
