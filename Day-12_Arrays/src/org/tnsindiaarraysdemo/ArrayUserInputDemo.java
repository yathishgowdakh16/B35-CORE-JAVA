package org.tnsindiaarraysdemo;

public class ArrayUserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=s,nextInt();
		//array declaration
		int arr[]=new int[size];
		System.out.println("Enter the values in the array: ");
		
		//to enter the values in the array use for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+"index:");
			arr[i]=s.nextInt();
		}
		//to print the array elements
		System.out.print("Array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.printf(arr[i]+" ");
		}

	}

}
