package org.oops;

public class InnerClassDemo {
	
	static int counter = 0;
	int seq = 1;
	
	static class staticNestedclass{
		void display() {
			counter+=1;
			System.out.println("Counter:"+counter);
		}
	}
	
	class IncreamentCounter{
		if(!evenflag) {
			seq+=2;
		}else {
			seq+=1;
		}
		System.out.println("Sequence:"+seq);
		System.out.println("even flag:+"evenflag);
	}

	public static void main(String[] args) {
		InnerClassDemo.staticNestedclass sn = new InnerClassDemo.staticNestedclass();
		sn.display();
		sn.display();
		IncreamentCounter 
	}

}
