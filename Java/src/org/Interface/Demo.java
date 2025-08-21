package org.Interface;

interface T1{
	void m1();
}

public class Demo implements T1{
	
	static void show() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		Demo d = new Demo();
		d.m1();
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("I am implement method");
		
	}

}
