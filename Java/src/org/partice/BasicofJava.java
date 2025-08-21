package org.partice;

public class BasicofJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10,num1=20;
		System.out.println("original number of num:"+num +","+num1);
		int temp=num;
		num=num1;
		num1=temp;
		System.out.println("original number of num after swap:"+num +","+num1);
		num=num1+num;
		num1=num-num1;
		num=num-num1;
		System.out.println("original number of num after swap using operators:"+num +","+num1);
		num=num1*num;
		num1=num/num1;
		num=num/num1;
		System.out.println("original number of num after swap using operators:"+num +","+num1);
	} 

}
