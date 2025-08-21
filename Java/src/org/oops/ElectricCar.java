package org.oops;

public class ElectricCar extends Car {
	String message;
	public ElectricCar(String b, String m, int y) {
		super(b, m, y);
		this.message="It is a future";
		
	}
	public void display() {
		super.display();
		System.out.println(this.message);

	}

}
