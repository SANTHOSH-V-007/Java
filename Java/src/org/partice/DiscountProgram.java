package org.partice;

import java.util.Scanner;

public class DiscountProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity to purchase: ");
		int quantity = sc.nextInt();
		int cost = 100;
		int totalcost = quantity*cost;
		double finalcost = totalcost;
		
		if(totalcost>1000) {
			double discout = totalcost*0.10;
			finalcost = totalcost-discout;
			System.out.println("Discount Applied:"+discout);
		}
		System.out.println("Total cost:"+finalcost);

	}

}
