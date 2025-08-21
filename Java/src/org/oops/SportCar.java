package org.oops;

public class SportCar extends Car{
	int topspeed;
	public SportCar(String b, String m, int y,int ts) {
		super(b, m, y);
		this.topspeed=ts;	
	}
	public void displayspeed() {
		display();
		System.out.println("TopSpeed: "+topspeed+"mph");
	}

}
