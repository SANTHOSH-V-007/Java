package org.Interface;

interface show{
	void display1();
	void display2(int a);
	void display3(int a,int b);
}

public class Exercise implements show{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise m = new Exercise();
		m.display1();
		m.display2(10);
		m.display3(10, 20);
		

	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Display method one for interface");
		
	}

	@Override
	public void display2(int a) {
		// TODO Auto-generated method stub
		System.out.println("Display method two for interface a="+a);
		
	}

	@Override
	public void display3(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Display method Three for interface a+b="+(a+b));
		
	}

}
