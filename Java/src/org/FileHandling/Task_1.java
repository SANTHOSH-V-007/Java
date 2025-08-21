package org.FileHandling;

public class Task_1 {
	static class OddTask_1 extends Exception{
		public OddTask_1(String message) {
			super(message);
		}
	}
	public static void checkout(int number) throws OddTask_1{
		if(number%2!=0) {
			throw new OddTask_1("Number "+number+" is Odd!");
		}
		System.out.println("Number "+number+" is Even");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] TestNumber = {2,3,4,5,6,7};
		for(int num:TestNumber) {
			try {
				checkout(num);
			} catch (OddTask_1 e) {
				// TODO: handle exception
				System.out.println("Caught Exception: "+e.getMessage());
			}
		}

	}

}
