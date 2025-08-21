package org.partice;

import java.util.Scanner;

public class SquareProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length Value: ");
		int length = sc.nextInt();
		System.out.println("Enter the Breath Value: ");
		int breath = sc.nextInt();
		if(length==breath) {
			System.out.println("Entered values are Square");
		}else {
			System.out.println("Entered Values are Not a Square");
		}
	}

}
