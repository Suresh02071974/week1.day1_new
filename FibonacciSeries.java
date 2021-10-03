package week1.day1.assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range :");
		int firstnum1 = 0, secNum = 1, sum = 0, range = sc.nextInt();

		System.out.print(firstnum1 + " ");

		for (int i = 1; i <= range; i++) {
			sum = firstnum1 + secNum;
			firstnum1 = secNum;
			secNum = sum;
			System.out.print(sum + " ");
		}

		System.out.println("\n");

	}

}
