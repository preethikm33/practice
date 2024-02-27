package com.first;
class Doctor{
	float salary=50000;
}
class Surgeon extends Doctor{
	float bonus=20000;
}

public class Inheritance {

	public static void main(String[] args) {
		Surgeon s=new Surgeon(); //creating object
		System.out.println("salary of surgeon" +s.salary);
		System.out.println("bonus of surgeon" +s.bonus);
		
		

	}

}
