//To print the list of Prime Numbers within a range.

import java.util.Scanner;
class Prime_list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lower, upper;
		boolean flag;

		System.out.print("Enter a lower limit: ");
		lower = sc.nextInt();
		System.out.print("Enter a upper limit: ");
		upper = sc.nextInt();

		System.out.print("Prime Numbers betweeen " + lower + "-> ");
		for (int num = lower+1; num < upper; ++num) {
			flag = true;
			for (int i = 2; i <= num/i ; ++i) {
				if (num % i == 0) {
					flag = false;
					break;					
				}
			}

			if (flag == true) {
				System.out.print(num + " ");			
			}
		}

		System.out.print("->" + upper);
	}
}