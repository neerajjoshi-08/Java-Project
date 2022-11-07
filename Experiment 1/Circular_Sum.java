//To add the sum of digits.

import java.util.Scanner;
class Circular_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;

		System.out.print("Enter a Number: ");
		num = sc.nextInt();

        while (num > 0 || sum > 9)  
        { 
            if (num == 0) { 
                num = sum; 
                sum = 0; 
            } 
            sum += num % 10; 
            num /= 10; 
        } 
        
		System.out.println("Sum of the digits is: " + sum);
	}
}