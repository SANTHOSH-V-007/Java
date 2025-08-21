package org.partice;

import java.util.Scanner;

public class EligibleForVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age  =  sc.nextInt();
		System.out.println("Your age is :"+age);
		if(age>=18) {
			System.out.println("You are Eligible to Vote");
		}
		else {
			System.out.println("You are not eligible to Vote");
		}

	}

}
