package org.Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.out.println(10/0);
		}
		catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("welcome to happy tour");

	}

}
