package org.oops;

public class UsbTask {

	static class USB{
		int usb2 = 2;
		int usb3 = 1;
		
		int totalPorts() {
			return usb2+usb3;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsbTask.USB usb = new UsbTask.USB();
		System.out.println(usb.totalPorts());

	}

}
