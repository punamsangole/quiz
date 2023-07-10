package com.demo;

public class Student {
	
	public static void main(String[] args) {

		C c = new C();
		//c.demo();
		c.example();
	}

}

 abstract class Test1 {

	abstract void example();// abstarct method

	//abstract void demo();

}

 class C extends Test1 {

	void example() {
		System.out.println("this is the sample method");
	}

	//void demo() {
		//System.out.println("this is the demo method");
	//}

}
