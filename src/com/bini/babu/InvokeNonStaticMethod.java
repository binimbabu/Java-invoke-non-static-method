package com.bini.babu;

public class InvokeNonStaticMethod {

	InvokeNonStaticMethod(){
		System.out.println("Inside constructor");
	}
	
	{
		System.out.println("Inside non-static block");
	}
	
	public static void main(String[] args) {
	 System.out.println("Inside main function");
     InvokeNonStaticMethod insm = new InvokeNonStaticMethod();
     insm.doSomething();
    
	}
    void doSomething(){
    	System.out.println("inside non static method");
    }
}
