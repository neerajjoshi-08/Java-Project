//To check wheather a number is Palindrome or not.  

import java.util.Scanner;
class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, temp, rem, sum = 0;
		
		System.out.print("Enter a Number: ");
		num = sc.nextInt();
		
		temp = num;

		while(num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num /= 10;
		}
		
		if (temp == sum) {
			System.out.println(temp + " is Palindrome.");
		}
		else {
			System.out.println(temp + " is not Palindrome.");
		}
	}
}