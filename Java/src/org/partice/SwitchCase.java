package org.partice;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entry the day");
		String day = sc.next();
		switch(day) {
		case "Mon":
			System.out.println("Day one");
			break;
		case "Tue":
			System.out.println("Day Two");
			break;
		case "Wed":
			System.out.println("Day Three");
			break;
		case "Thu":
			System.out.println("Day Four");
			break;
		case "Fri":
			System.out.println("Day Five");
			break;
		case "Sat":
			System.out.println("Day Sixth");
			break;
		case "Sun":
			System.out.println("Day Seventh");
			break;
		default:
			System.out.println("No such day");
			break;
		}
	}

}
