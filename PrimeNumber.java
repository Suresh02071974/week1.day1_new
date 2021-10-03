package week1.day1.assignments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Integer :");
		int i, num = sc.nextInt();

		boolean flag = false;

		int  j = num / 2;

		
			
			if (num==0 || num==1) {
				System.out.println("The value of " + num + " is not a primenumber");			}

			else 
				for (i = 2; i <= j; i++) {
				if (num % i == 0) {
				System.out.println("The value of " + num + " is not a primenumber");

				flag = true;
				break;
			}

		}

			   if(flag==false)  { System.out.println(num+" is prime number"); }  

	}
}
