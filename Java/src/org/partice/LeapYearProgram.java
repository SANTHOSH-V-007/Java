package org.partice;

public class LeapYearProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2005;
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println(year+" entered is leap year");
		}
		else {
			System.out.println(year+" entered is not leap year");
		}
		// 2. second type
//		else if(year%4==0 && year%100!=0) {
//			System.out.println(year+" entered is leap year");
//		}
//		else {
//			System.out.println(year+" entered is not leap year");
//		}
	//	1. first type
//		else {
//			if(year%4==0) {
//				if(year%100!=0) {
//					System.out.println(year+" entered is leap year");
//				}
//				else {
//					System.out.println(year+" entered is not leap year");
//				}
//			}
//			else {
//				System.out.println(year+" entered is not leap year");
//			}
		

	}

}
