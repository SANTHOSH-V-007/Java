package org.oops;

public class CarTask {
	
	String carName;
	String carType;
	
	public CarTask(String carName,String carType) {
		this.carName = carName;
		this.carType = carType;
	}
	
	private String getCarName() {
		return carName;
	}
	
	class Engine{
		String engineName;
		String engineType;
		
		public void setEngineType(String engineType) {
			if(carName == "Tata" && carType == "EV") {
				this.engineType = engineType;
				System.out.println(this.engineType);
			}else {
				System.out.println("No means No!!");
			}		
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarTask car = new CarTask("Tata","EV");
		CarTask.Engine engine = car.new Engine();
		engine.setEngineType("EVTypeEngine");

	}

}
