package org.oops;

abstract class Person{
	abstract void display();
}

public class OuterClassDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person() {
			void display() {
				System.out.println("Anonyms inner class");
			}
		};
		person.display();

	}

}


/*
 * create a outer class Cpu with property prize
 *create two nested classes
 * 1. Processor with properties cores and manufacturer and method getCache() return double
 * 2. RAM with properties memory and manufacture and method getClockspeed return double.
 * create outer class object of cpu then create object of inner class processor and RAM
 * with the processor and RAM object display getcache() and getClockspeed
*/

/*
 * create a outerclass Car with properties carname,cartype write constructors and private method getCarName
 * create innerclass Engine with properties Enginetype and methid setEngine() and setEnginetype()
 * In setEngine write a logic that based on the cartype and carName set the enginetype.
 * In getEnginetype() display the set engine type in the method setEnginetype
 */

/*
 * create outerclass motherboard and inner static class USB with properties int usb2=2 and int usb3=1
 * class usb has one method which will calculate the totalports()
 */
 
