package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 * 
 *         Date - 15/10/2020
 * 
 * 
 *         Amstrong Number Means - Given numbers each digits cube is equall to
 *         the given number
 * 
 *         Some Amstrong Number - 370 , 371 , 407 etc
 * 
 *         Ex - 153 = 1*1*1* + 5*5*5 + 3*3*3 = 153
 *
 */
public class AmstrongNumber {

//	Global Declaration 
	Scanner input = new Scanner(System.in);
	int num, rem, cube, amstr = 0, temp;
//	Store the input value to another variable for later compare 

	/**
	 * this method is used to take input from user
	 */
	void input() {
		System.out.println("Enter The Number");
		num = input.nextInt();
		temp = num;
	}

	/**
	 * Logic For Amstrong Number
	 * 
	 */
	void logic() {

		while (num > 0) {
			rem = num % 10;
			cube = rem * rem * rem;
			amstr = amstr + cube;
			num = num / 10;
		}
	}

	/**
	 * This method is used to provide output of program
	 */
	void output() {
		num = temp;
		if (amstr == num) {

			System.out.println("This is a Amstrong Number");
		} else {
			System.out.println("This is a Not Amstrong Number ");
		}
	}

	/**
	 * @param args
	 * 
	 *             This is the Main Methon Here Jdk Start Execution
	 * 
	 */
	public static void main(String[] args) {
		AmstrongNumber obj = new AmstrongNumber();
		obj.input();
		obj.logic();
		obj.output();
	}

}
