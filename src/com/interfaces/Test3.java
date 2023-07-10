package com.interfaces;

public class Test3 implements Test{
   public void m1() {
    	System.out.println("interface");
    }
    
   public void m2() {
    	System.out.println("interface");
    }
   
   public static void main(String[] args) {
	Test3 t=new Test3();
	t.m1();
	t.m2();
	
}
}
