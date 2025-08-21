package org.oops;

public class OuterClass {
	
	void  displayStatus() {
		int year = 1999;
		class DisplayAge{
			String status = "Adult";
			void displayAge() {
				int age = 2025-year;
				if(age>17) {
					System.out.println("Entered Person age: "+age+"And status is"+status);
				}else {
					status = "Non-Adult";
					System.out.println("Entered Person age"+age+"and status is"+status);
				}
			}
		}
		DisplayAge is = new DisplayAge();
		is.displayAge();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass ou = new OuterClass();
		

	}

}
