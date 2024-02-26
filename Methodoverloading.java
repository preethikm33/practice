//several methods in java are allowed to have same method name and different parameters
//different ways to overload methods
//1.by changing number of arguments 2.by changing data type
package com.first;

public class Methodoverloading {
	 static int addition(int a,int b) //creating method
	 {
		 return a+b;
	 }
	 static int addition(int a,int b,int c) //creating method
	 {
		 return a+b+c;
	 }
	 static double addition(double a,double b) //creating method
	 {
		 return a+b;
	 }

	public static void main(String[] args) {
		System.out.println(addition(2,3));
		System.out.println(addition(2.1,3.2));
		System.out.println(addition(2,3));
		}

}
