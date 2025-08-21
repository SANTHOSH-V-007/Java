package org.Array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] primes = {3,5,7,11,13};
//		for(int i=0;i<primes.length;i++) {
//			System.out.println("The prime numbers are:"+primes[i]);
//		}
//		for(int prime:primes) {
//			System.out.println("Prime Numbers"+prime);
//		}
//		int[][] matrix= {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//		System.out.println(matrix[1][1]);
//		for(int[] mat:matrix) {
//			for(int m:mat)
//			System.out.println(m);
//		}
//		int[] copyOfPrimes = Arrays.copyOf(primes,4);
//		System.out.println("Original Array:"+Arrays.toString(primes));
//		System.out.println("Copied Array:"+Arrays.toString(copyOfPrimes));
//		Arrays.sort(primes);
//		System.out.println("Sorted Array:"+Arrays.toString(primes));
//		int index = Arrays.binarySearch(primes, 7);
//		System.out.println("number 7 is at position"+index);
//		String[] design = new String[50];
//		Arrays.fill(design, "*");
//		System.out.println(Arrays.toString(design));
		
		int max = primes[0];
		int min = primes[0];
		for(int prime:primes) {
			if(prime>max) {
				max=prime;
			}
			if(prime<min) {
				min=prime;
				
			}
		}
		System.out.println("Maximum number for the array is:"+max);
		System.out.println("Minimum number for the array is:"+min);
		
		for(int i=0;i<primes.length/2;i++) {
			int temp = primes[i];
			primes[i] = primes[primes.length-1-i];
			primes[primes.length-1-i]=temp;
			
		}
		System.out.println("Reverse of the array"+Arrays.toString(primes));
	}
	
}
