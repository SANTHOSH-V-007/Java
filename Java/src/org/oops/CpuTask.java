package org.oops;

public class CpuTask {
	
	double price = 67.89;
	class Processor{
		String cores = "i5";
		String manufacturer = "Intel";
		
		double getCache() {
			return price;
		}
	}
	
	class RAM{
		String memory = "1TB";
		String manufacturer = "Dell";
		
		double getClockSpeed() {
			
			return 0.12;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CpuTask cpu = new CpuTask();
		CpuTask.Processor processor = cpu.new Processor();
		System.out.println(processor.getCache());
		
		CpuTask.RAM ram = cpu.new RAM();
		System.out.println(ram.getClockSpeed());
 

	}

}
