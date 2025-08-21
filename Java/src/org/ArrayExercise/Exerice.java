package org.ArrayExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Exerice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Task-1 Ascending Order
		
//		int[] arr = {10,35,29,394,209,112,9,4};
//		System.out.println("Original Array : "+ Arrays.toString(arr));  
//		Arrays.sort(arr);  
//		System.out.print("Sorted Array : "+ Arrays.toString(arr));

		
		
		//Task-2 Descending Order
		
//		Integer[] arr1 = {13,96,42,85,21,10,2,137};
//		System.out.println("Original Array : "+ Arrays.toString(arr1));  
//		Arrays.sort(arr1,Collections.reverseOrder());  
//		System.out.print("Sorted Array : "+ Arrays.toString(arr1));
		
		
		
		//Task-3 sum values of an array
		
//		int [] arr2 ={ 12, 3, 4, 15, 46, 29 }; 
//		int sum = 0; 
//		for (int i = 0; i < arr2.length; i++) {
//			sum += arr2[i];
//		}
//		System.out.println("Sum Values of Array : " + sum);
		
		
	
		//Task-4 average value of array elements
		
//		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
//        int length = array.length;
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        double average = sum / length;
//        System.out.println("Sum of Array Value : " + sum); 
//        System.out.println("Average of array : "+average); 
		
		
		
		//Task-5  store elements in an array and print it
		
//		int[] arr5 = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };
//        System.out.print("Elements of given array are: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr5[i] + " ");
//        }
        
		
		
        //Task-6 array size to be user input print it
        
//    	int[] arr6 = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };
//        System.out.print("Elements of given array are: ");
//        for (int i = 0; i < arr6.length; i++) {
//            System.out.print(arr6[i] + " ");
//        }
        
		
		
        //Task-7 sum of all elements of the array
//        int [] arr7 ={ 12, 3, 4, 15, 46, 29 }; 
//		int sum = 0; 
//		for (int i = 0; i < arr7.length; i++) {
//		sum += arr[i];
//		}
//		System.out.println("Sum Values of Array : " + sum);
		
		
		
		
		//Task-8 read n number of values in an array and display it in reverse order
		
//		  int[] arr8 = {1, 2, 3, 4, 5};
//	        for (int i = 0; i < arr8.length / 2; i++) {
//	            int t = arr8[i];
//	            arr8[i] = arr8[arr8.length - 1 - i];
//	            arr8[arr8.length - 1 - i] = t;
//	        }
//	        System.out.println("" + Arrays.toString(arr8));
	
		
		
		
        //Task-9 array elements to print cubic values
		
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println("Cubic values of array elements:");
//        for (int number : numbers) {
//            int cube = number * number * number;
//            System.out.println("The cube of " + number + " is: " + cube);
//        }
		
		
		
		//Task-10 maximum and minimum element in an array
		
//		int [] primes = {3,5,7,11,13};
//		int max = primes[0];
//		int min = primes[0];
//		for(int prime:primes) {
//			if(prime>max) {
//				max=prime;
//			}
//			if(prime<min) {
//				min=prime;
//				
//			}
//		}
//		System.out.println("Maximum number for the array is:"+max);
//		System.out.println("Minimum number for the array is:"+min);
		
		
		
		
		//Task-11 array elements print all Odd number
		
//	     int a[] =  {23, 45, 67, 34, 78};
//	     System.out.print("Odd numbers:");
//	        for(int i = 0 ; i < a.length ; i++)
//	        {
//	            if(a[i] % 2 != 0)
//	            {
//	                System.out.print(a[i]+" ");
//	            }
//	        }
		
		
		
		
		//Task-12 array elements print all Even number
		
//		int b[] = {23, 45, 89, 34, 12};
//		 System.out.print("Even numbers:");
//	        for(int i = 0 ; i < b.length ; i++)
//	        {
//	            if(b[i] % 2 == 0)
//	            {
//	                System.out.print(b[i]+" ");
//	            }
//	        }
		
		
		
		//Task-13  array elements to print sum of Odd Numbers
		
//		int c[] = {12, 34, 59, 45, 22};
//		int sumO=0;
//		for(int i = 0; i < c.length; i++)
//        {
//            if(c[i] % 2 != 0)
//            {
//                sumO = sumO + c[i];
//            }
//        }
//		System.out.println("Sum of Odd Numbers:"+sumO);
		
		
		
		
		//Task-14  array elements to print sum of Even Numbers
		
//				int d[] = {56, 78, 45, 79, 34};
//				int sumE=0;
//				for(int i = 0; i < d.length; i++)
//		        {
//		            if(d[i] % 2 == 0)
//		            {
//		                sumE = sumE + d[i];
//		            }
//		        }
//				System.out.println("Sum of Even Numbers:"+sumE);
			
		
		
		
		//Task-15 array elements to print sum of Cubic Values
//				
//		int e[] =  {1, 2, 3, 4, 5};
//		int sum=0;
//		System.out.println("Cubic values of array elements:");
//		for (int number : e) {
//          int cube = number * number * number;
//          sum = sum+(number * number * number);
//          System.out.println("The cube of " + number + " is: " + cube);
//		}
//		System.out.println("sumOfSeries of Cube:"+sum);
		
		
		
		
		//Task-16 copy the elements of one array into another array
		
//		int [] primes1 = {1, 2, 3, 4, 5};
//		int[] copyOfPrimes = Arrays.copyOf(primes1,5);
//		System.out.println("Original Array:"+Arrays.toString(primes1));
//		System.out.println("Copied Array:"+Arrays.toString(copyOfPrimes));
//		
		
		
		
		//Task-17 merge two arrays elements to store third array
		
//		int[] arr1 = { 1, 2, 3, 4, 5 };
//        int[] arr2 = { 6, 7, 8, 9, 10 };
//        
//        int a = arr1.length;
//        int b = arr2.length;
//        int[] result = new int[a + b];
//
//        System.arraycopy(arr1, 0, result, 0, a);
//        System.arraycopy(arr2, 0, result, a, b);
//
//        System.out.println(Arrays.toString(result));
		
		
		
		
		//Task-18 array elements print all Positive number
		
//		int[] positive = {67, -4, 3, -5, 44};
//		System.out.println("Positive numbers in the array:");
//        for (int number : positive) {
//            if (number > 0) {
//                System.out.print(number+ " ");
//            }
//        }
        
		
		
		
        //Task-19  array elements print all Negative number
        
//        int[] negative = {-45, 32, -7, 3, -6};
//        System.out.println("Negative numbers in the array:");
//        for (int number : negative) {
//            if (number < 0) {
//                System.out.print(number+ " ");
//            }
//        }
        
		
		
		
        //Task-20 array elements to print sum of Positive Numbers
		
//		int[] positive1 = {1, -2, 3, 3, 4};
//		int sum =0;
//		System.out.println("Sum of Positive numbers in the array:");
//		for (int number : positive1) {
//            if (number > 0) {
//            	sum = sum+number;
//            }
//        }
//		System.out.print(sum);
		
		
		
		//Task-21 array elements to print sum of Negative Numbers
		
//		int[] negative1 = {10, -23, 45, -10, 30};
//		int sum1 =0;
//		System.out.println("Sum of Positive numbers in the array:");
//		for (int number : negative1) {
//            if (number < 0) {
//            	sum1 = sum1+number;
//            }
//        }
//		System.out.print(sum1);
		
		
		//Task-22 search an element in an array
//		Scanner sc = new Scanner(System.in);
//		int[] Element = {10, 20, 30, 40, 50};
//		int x = 0, flag = 0,i=0;
//		System.out.print("Enter the element you want to find:");
//		x = sc.nextInt();
//		for(i = 0; i < Element.length; i++)
//        {
//            if(Element[i] == x)
//            {
//                flag = 1;
//                break;
//            }
//            else
//            {
//                flag = 0;
//            }
//        }
//        if(flag == 1)
//        {
//            System.out.println("Element found at position:"+(i + 1));
//            System.out.println("Element is found in the index :"+ i);
//        }
//        else
//        {
//            System.out.println("Element not found");
//        }
        
		
		
        //Task-23 Delete Duplicate Elements from an Array
		
//		int[] duplicate = {10, 10, 20, 20, 30};
//		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
//		for (int i = 0; i < duplicate.length; i++)
//        s.add(duplicate[i]);
//		System.out.print(s);
		
		
		
		//Task-24 Print Unique Elements in Array
		
//		int[] unique =  {10, 20, 40, 20, 10};
//		for (int i = 0; i < unique.length; i++)
//        {
//            int j;
//            for (j = 0; j < i; j++)
//            if (unique[i] == unique[j])
//                break;
//            if (i == j)
//                System.out.print( unique[i] + " ");
//        }
		
		
		
		//Task-25 the second smallest element in an array
		
//		int[] secondsmallest =   {10, 20, 5, 2, 30};
//		 for(int i = 0; i<secondsmallest.length; i++ ){
//	         for(int j = i+1; j<secondsmallest.length; j++){
//	            if(secondsmallest[i]<secondsmallest[j]){
//	               int temp = secondsmallest[i];
//	               secondsmallest[i] = secondsmallest[j];
//	               secondsmallest[j] = temp;
//	            }
//	         }
//	      }
//	      System.out.println("2nd Smallest element of the array is:: "+secondsmallest[secondsmallest.length-2]);
//		

		
		//Task-26 identifies the Even elements in two arrays and creates a third array with those elements
		
//		int[] FirstArray =   {1, 2, 3, 4, 5};
//		int[] SecondArray =   {6, 7, 8, 9, 10};
//		int evenSize = 0;
//        for (int i = 0; i < FirstArray.length; i++) {
//            if (FirstArray[i] % 2 == 0) {
//            	evenSize++;
//            }        
//        }
//        for (int i = 0; i < SecondArray.length; i++) {
//            if (SecondArray[i] % 2 == 0) {
//            	 evenSize++;
//            }        
//        }
//        int[] even = new int[evenSize];
//        int j = 0;
//        for (int i = 0; i < FirstArray.length; i++) {
//            if (FirstArray[i] % 2 == 0) {
//            	  even[j++] = FirstArray[i];
//            }       
//        }
//        for (int i = 0; i < SecondArray.length; i++) {
//            if (SecondArray[i] % 2 == 0) {
//            	even[j++] = SecondArray[i];
//            }       
//        }
//        System.out.print("Even Array contains: "+ Arrays.toString(even));
        
        
        //Task-27  identifies the Odd elements in two arrays and creates a third array with those elements
        
//        int[] FirstArray1 =   {1, 2, 3, 4, 5};
//		int[] SecondArray1 =   {6, 7, 8, 9, 10};
//		int oddSize = 0;
//        for (int i = 0; i < FirstArray1.length; i++) {
//            if (FirstArray1[i] % 2 != 0) {
//            	oddSize++;
//            }        
//        }
//        for (int i = 0; i < SecondArray1.length; i++) {
//            if (SecondArray1[i] % 2 != 0) {
//            	 oddSize++;
//            }        
//        }
//        int[] odd = new int[oddSize];
//        int f = 0;
//        for (int i = 0; i < FirstArray1.length; i++) {
//            if (FirstArray1[i] % 2 != 0) {
//            	  odd[f++] = FirstArray1[i];
//            }       
//        }
//        for (int i = 0; i < SecondArray1.length; i++) {
//            if (SecondArray1[i] % 2 != 0) {
//            	odd[f++] = SecondArray1[i];
//            }       
//        }
//        System.out.print("Odd Array contains: "+ Arrays.toString(odd));
		
		
		//Task-28 find the common elements between two arrays of integers
		
//		  int[] FirstArray2 =   {10, 20, 30, 40, 50};
//		  int[] SecondArray2 =   {10, 30, 60, 50, 70};
//		  List<Integer> commonElements = new ArrayList<>();
//		  for (int i = 0; i < FirstArray2.length; i++) {
//	            for (int j = 0; j < SecondArray2.length; j++) {
//	            	 if (FirstArray2[i] == SecondArray2[j]) {
//	                     if (!commonElements.contains(FirstArray2[i])) {
//	                         commonElements.add(FirstArray2[i]);
//	                     }
//	                     break; 
//	            }
//	            }
//		  }
//		  System.out.println("Common elements: " + commonElements);
		
		
		//Task-29 find the second Largest element in an array
		
//		int[] largest = {10,20,30,40,50};
//		Arrays.sort(largest);
//		System.out.println(largest[largest.length-2]);
		
		
		
		//Task-30  find a missing number in an array
		
//		int[] missing = {1, 2, 4, 5, 6, 7};
//		int n = missing.length+1;
//		int expectsum = n*(n+1)/2;
//		int actualsum=0;
//		for(int i:missing) {
//			actualsum+=i;
//		}
//		int missingNumber = expectsum-actualsum;
//		System.out.println("Missing Number: "+ missingNumber);
		
		
		
		//Task-31 Sort an array in ascending order using quicksort
		
//		int[] quicksort = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
//		Arrays.sort(quicksort);
//		System.out.println("Sorted Array using quicksort: "+ Arrays.toString(quicksort));
		
		
		//Task-32  Sort an array in descending order using bubble sort
		
//		int[] bubblesortdescending =  {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
//		 for (int i = 0; i < ( bubblesortdescending.length - 1 ); i++) {
//		      for (int j = 0; j < bubblesortdescending.length - i - 1; j++) {
//		        if (bubblesortdescending[j] < bubblesortdescending[j+1]) 
//		        {
//		          int temp = bubblesortdescending[j];
//		          bubblesortdescending[j] = bubblesortdescending[j+1];
//		          bubblesortdescending[j+1] = temp;
//		        }
//		      }
//		    }
//		 System.out.println("Sorted Array in des using bubblesort: "+ Arrays.toString(bubblesortdescending));
		

		
		//Task-33  Sort an array in ascending order using bubble sort
		
//		int[] bubblesortAscending =  {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
//		for (int i = 0; i < ( bubblesortAscending.length - 1 ); i++) {
//		      for (int j = 0; j < bubblesortAscending.length - i - 1; j++) {
//		        if (bubblesortAscending[j] > bubblesortAscending[j+1]) 
//		        {
//		          int temp = bubblesortAscending[j];
//		          bubblesortAscending[j] = bubblesortAscending[j+1];
//		          bubblesortAscending[j+1] = temp;
//		        }
//		      }
//		    }
//		 System.out.println("Sorted Array in Asc using bubblesort: "+ Arrays.toString(bubblesortAscending));
		
		
		
		//Task-34 Sort an array in descending order using selection sort
		
//		int[] selectionsortdescending =  {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
//		for (int i = 0 ;i< selectionsortdescending.length-1; i++){
//			int min = i;
//			for (int j = i+1; j< selectionsortdescending.length; j++){
//				if (selectionsortdescending[j] > selectionsortdescending[min]){
//					min = j;
//				}
//			}
//			int temp = selectionsortdescending[min];
//			selectionsortdescending[min] = selectionsortdescending[i];
//			selectionsortdescending[i] = temp;
//			}
//		System.out.println("Sorted Array in des using Selectionsort: "+Arrays.toString(selectionsortdescending));
		
 
		
		//Task-35 Sort an array in ascending order using selection sort
		
//		int[] selectionsortascending =  {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
//		for (int i = 0 ;i< selectionsortascending.length-1; i++){
//			int min = i;
//			for (int j = i+1; j< selectionsortascending.length; j++){
//				if (selectionsortascending[j] < selectionsortascending[min]){
//					min = j;
//				}
//			}
//			int temp = selectionsortascending[min];
//			selectionsortascending[min] = selectionsortascending[i];
//			selectionsortascending[i] = temp;
//			}
//		System.out.println("Sorted Array in Asc using Selectionsort: "+Arrays.toString(selectionsortascending));
		
		
		//Task-36 Search an item in an array using binary search
		
		int[] binarysearch = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		
}
}
