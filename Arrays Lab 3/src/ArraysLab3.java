/*Samantha Chow
 * 11/6/16
 * APCS Period 1
 * 
 * Arrays Lab 3  This code will manipulate arrays to append an item, remove an item, 
 * add the elements, add the even elements, and rotate the elements to the right.

 */

//package arrays_materials;

import java.util.Arrays;


public class ArraysLab3 
{
	/* 
	 * sum accepts two arrays of integers arr1 and arr2 and returns an array of integers, 
	 * in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	 * You can assume arrays arr1 an d arr2 have at least one element each and are the same length.
	 */
	public static int[] sum(int[] arr1, int[] arr2)
	{
		assert (arr1.length > 0);
		assert (arr2.length > 0);
		assert (arr1.length == arr2.length);
		
		int[] sumArray = new int[arr1.length];
		for(int i = 0; i <= (arr1.length-1); i++){
			sumArray[i] = arr1[i] + arr2[i];
		}
		return sumArray;
		
	}
	
	/*
	 * append accepts an array of integers arr of length n 
	 * and an integer num, and returns an array of integers of length n+1 
	 * that consists of the elements of arr with num appended to the end.  
	 * You can assume array arr has at least one element.
	 */
	public static int[] append(int[] arr, int num)
	{
		assert (arr.length > 0);
		
		int[] appendArray = new int[arr.length+1];
		for(int i = 0; i < arr.length; i++){
			appendArray[i] = arr[i];
		}
		appendArray[arr.length] = num;
		return appendArray;
	}
	
	/*
	 * remove accepts an array of integers arr and an integer idx 
	 * and returns an array of integers consisting of all of the elements of arr 
	 * except for the element at index idx (thus, the returned array has a length of arr.length – 1).  
	 * You can assume arr has at least two elements.
	 */
	public static int[] remove(int[] arr, int idx)
	{
		assert (arr.length >= 2);
		
		
		int[] removeArray = new int[arr.length-1];
		for(int i = 0; i < idx; i++){
			removeArray[i] = arr[i];
		}
		for(int j = (idx+1); j < arr.length; j++){
			removeArray[j-1] = arr[j];
		}
		return removeArray;
	}
	
	/*
	 * sumEven accepts an array of integers arr 
	 * and returns an integer containing the sum of the elements at the even indices of arr.  
	 * (That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.
	 */
	public static int sumEven(int[] arr)
	{
		assert (arr.length > 0);
		
		int sum = 0;
		for(int i = 0; i <= arr.length-1; i++){
			if( i % 2 == 0){
				sum += arr[i];
			}
		}
		return sum;
	}
	
	/*
	 * rotateRight accepts an array of integers arr and does not return a value.  
	 * The rotateRight method moves each element of arr one index to the right 
	 * (element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0).  
	 * You can assume arr has at least one element.
	 */
	public static void rotateRight(int[] arr)
	{
		assert (arr.length > 0);
		
		int last = arr[arr.length-1];
		for(int i = arr.length-1; i>=1; i--){
			arr[i] = arr[i-1];
		}
		arr[0]=last;
	}

	
	
	public static void main(String[] args) 
	{
		//initializing all the arrays
		int[] arr1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] arr2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr = new int[arr1.length];
		int[] appendArr = new int[arr1.length+1];
		int[] removeArr = new int[arr1.length-1];
		
		//initializing all the variables
		int appendNum = 200;
		int removeIdx = 5;
		int sumOfEvens;
		
		//call and print sum with arr1 and arr2 passed in
		sumArr = sum(arr1, arr2);
		System.out.println(Arrays.toString(sumArr));
		
		//call and print append with arr1 and appendNum passed in
		appendArr = append(arr1, appendNum);
		System.out.println(Arrays.toString(appendArr));
		
		//call and print remove with arr2 and removeIdx passed in
		removeArr = remove(arr2, removeIdx);
		System.out.println(Arrays.toString(removeArr));
		
		//call and print sum with appendArr passed in
		sumOfEvens = sumEven(appendArr);
		System.out.println(sumOfEvens);
		
		//call and print sum with arr1 passed in
		rotateRight(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
