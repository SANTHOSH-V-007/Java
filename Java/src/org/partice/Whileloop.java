package org.partice;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*int sum=0;
		while(true) {
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			if(num<0) {
				System.out.println("Number entered is negative .. so exit and print sum");
				break;	
			}
			sum+=num;
		}
		System.out.println("The sum of Entered number is "+ sum);*/
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("The sum of 1 to 100 digits is: "+sum);
		int num = 5;
		int fact =1;
		
		for(int i=num;i>1;i--) {
			fact*=i;
		}
		System.out.println("Factorial of: "+num+":"+fact);
	}

} 

