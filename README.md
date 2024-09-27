Java-invoke-non-static-method


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



Output

Inside main function
Inside non-static block
Inside constructor
inside non static method



To invoke non-static method we crate an object instance in the main function (InvokeNonStaticMethod insm = new InvokeNonStaticMethod();
) then call the non static method (i.e  insm.doSomething();) . First the main function is called then the non-static block then the constructor is called. Atlast from the main function the non-static method is invoked ( i.e doSomething() ). Hence the output is 

Inside main function
Inside non-static block
Inside constructor
inside non static method
