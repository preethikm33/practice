package com.first;
//Base Class
class Parent {
 void show() {
	 System.out.println("Parent's show()"); }
}
//Inherited class
class Child extends Parent {
 // This method overrides show() of Parent
 @Override void show()
 {
     System.out.println("Child's show()");
 }
}

public class Methodoverriding {
 public static void main(String[] args)
 {
     Parent obj1 = new Parent();
     obj1.show();
     Parent obj2 = new Child();
     obj2.show();
 }
}