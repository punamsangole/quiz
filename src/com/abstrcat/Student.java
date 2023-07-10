package com.abstrcat;

public class Student extends Animal{
	public static void main(String[] args) {
		Student s=new Student();
		
		s.show1();
	}
	
	@Override
	void display() {
		System.out.println("this is abstract method implemented");
	}

}
