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




Constructor and Method

Constructor is a special member function and gets executed when an object is created. Constructor does not have a return type.Constructor name is the same name of class name.While constructor cannot be defined by using any keywords. 'this' in constructor refers to another constructor of the same class. Constructors cannot be inherited. But, we can invoke parent constructor from child constructor using 'super' keyword, but parent constructor cannot be inherited by child constructor. A default constructor can be generated by the compiler.

Method is a set of statements which defines certain actions. But method has a type defined along with the method name depending on type of value returned from the method. Return cannot be also not returning anything by declaring method void. Method name can have any name. When we define a method we can use the keywords abstract, final, native, static and synchronised. 'this' keyword in method refers to the instance of the class. Mthods can be inherited. No default methods are generated.

