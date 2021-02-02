package numbers.program;

import java.util.Scanner;

/**
 * @author Sanjay Kumar Das
 * 
 *         Date - 16/10/2020
 *
 */
public class LargestAmongThreeNumber {
	Scanner sc = new Scanner(System.in);
	int num1, num2, num3;

	void input() {
		System.out.println("Enter 1st Number");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		num2 = sc.nextInt();
		System.out.println("Enter 3rd Number");
		num3 = sc.nextInt();
	}

	void logic() {
		if (num1 > num2 && num1 > num2) {
			System.out.println("Frisr Number is Greatest= " + num1);
		} else {
			if (num2 > num3 && num2 > num1) {
				System.out.println("Second Number Is Greatest" + num2);
			} else {
				System.out.println("Third Number Is Greatest" + num3);
			}
		}
	}

	public static void main(String[] args) {
		LargestAmongThreeNumber obj = new LargestAmongThreeNumber();
		obj.input();
		obj.logic();
	}
}
