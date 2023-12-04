package com.abstraction;

public class C extends Test {
	
	void example() {
		System.out.println("this is the sample method");
	}
	
	void demo() {
		System.out.println("this is the demo method");
	}
public static void main(String[] args) {
		C c=new C();
		c.example();
		c.demo();
	} 


}
