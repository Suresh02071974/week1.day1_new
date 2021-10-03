package week1.day1;

import java.util.Scanner;

public class greatthree {
	
	int num1,num2,num3;
	
	public int find(int a,int b,int c) {
		if(a > b && a > c) {
			return a;
		}
		else if(b > c) {
			return b;
		}else
			return c;
		
	}

	public static void main(String[] args) {
		
		greatthree gt = new greatthree();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the First Integer :");
		gt.num1=sc.nextInt();
		System.out.print("Enter the Second Integer :");
		gt.num2=sc.nextInt();
		System.out.print("Enter the Third Integer :");
		gt.num3=sc.nextInt();
		
		int large =gt.find(gt.num1,gt.num2,gt.num3);
		System.out.println("The Largest NUmber amoung the given Number is "+large);
	}

}
