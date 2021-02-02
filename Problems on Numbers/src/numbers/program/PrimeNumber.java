package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 * 
 *         Prime Number - Number have its two factor i.e number itself and 1
 *
 */
public class PrimeNumber {
	Scanner sc = new Scanner(System.in);
	int num;
	int count = 0;

	/**
	 * Taking input from user
	 */
	public void input() {
		System.out.println("Enter The Number");
		num = sc.nextInt();
	}

	/**
	 * Logic for prime number
	 */
	public void logic() {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
	}

	/**
	 * Display the Output
	 */
	public void display() {
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}

	/**
	 * @param args
	 * 
	 * Main method for object Creation of above class and access not static method by - creating object 
	 * 
	 * Static method 
	 *              -Direct by class name
	 *              -By Creating Object of Class
	 *              -Directly 
	 * 
	 */
	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		obj.input();
		obj.logic();
		obj.display();
	}
}
