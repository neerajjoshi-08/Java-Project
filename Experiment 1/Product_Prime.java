//To determine the product of prime numbers in a digit.

import java.util.Scanner;
class Product_Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, rem, prod = 1;
		boolean flag;

		System.out.print("Enter a number: ");
		num = sc.nextInt();

		while (num > 0) {
			rem = num % 10;
			flag = true;
			for (int i = 2; i <= rem/i ; ++i) {
				if (rem % i == 0) {
					flag = false;
					break;					
				}
			}

			if (flag == true) {
				prod *= rem; 
			}
			num /= 10;		
		}	
		System.out.println("Product of prime numbers in a digit: " + prod);
	}
}