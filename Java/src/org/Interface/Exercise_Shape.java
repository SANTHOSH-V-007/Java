package org.Interface;

interface Shape 
{
    double calculateArea();
    double calculateArea1();
	void displayShapeName1();
	void displayShapeName();
}
class Exercise_Shape  implements Shape{
		
	private double radius;
	public Exercise_Shape(double radius) {
        this.radius = radius;
    }
	
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public void displayShapeName() {
		System.out.println("Circle");
		
	}
	
	private double width;
	private double height;

	    public Exercise_Shape(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	@Override
	public double calculateArea1() {
		return width * height;
	}

	@Override
	public void displayShapeName1() {
		System.out.println("Rectangle");
		
	}
	
	public static void main(String[] args) {
		Exercise_Shape circle = new Exercise_Shape(5.0);
		Exercise_Shape rectangle = new Exercise_Shape(4.0,6.0);
		circle.displayShapeName();
		System.out.println("Circle Area: "+ circle.calculateArea());	
		
		rectangle.displayShapeName1();
		System.out.println("Rectange area: "+ rectangle.calculateArea1());

	}

}

