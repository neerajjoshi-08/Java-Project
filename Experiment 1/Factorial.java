//Factorial of a number.

import java.util.Scanner;
class Factorial {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num, fact = 1;

		System.out.print("Enter a Number: ");
		num = sc.nextInt();

		for(int i = 1; i <= num; ++i) {
			fact = fact * i;							
		}
		
		System.out.println(num + "!= " + fact);
	
	}
}