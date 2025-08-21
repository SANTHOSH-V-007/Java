package org.oops;

public class CarOutput {

	public static void main(String[] args) {
		Car bmw =new Car("BMW","5 SERIES",2012);
		Car toyota =  new ElectricCar("Toyota","Camry",2024);
		SportCar audi  = new SportCar("Audi","A6",2023,200);
		
		toyota.setYear(1999);
		System.out.println("Brands listed are: "+bmw.getBrand()+","+toyota.getBrand());
		bmw.display();
		toyota.display();
		audi.displayspeed();
		
	}

}
