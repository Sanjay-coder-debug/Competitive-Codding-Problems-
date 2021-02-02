package numbers.program;

/**
 * @author Sanjay Kumar Das
 * 
 *         Date - 01/10/2020
 * 
 *         Find Prime Number With In Particular Range as Per Need
 * 
 *         Like - Find Prime Number Between 1 to 10
 * 
 *
 */
public class AllPrimeNumberWithRange {
	/**
	 * 
	 */
	void logic() {
		int i = 0;
		int num = 0;
//Used To Check Range 
		for (i = 1; i <= 10; i++) {
			int counter = 0;
//			Used To keep and check prime of all numbers
			for (num = i; num >= 1; num--) {
//				num-- it helps counter to count and check 
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
//			
			if (counter == 2) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		AllPrimeNumberWithRange obj = new AllPrimeNumberWithRange();
		obj.logic();
	}
}
