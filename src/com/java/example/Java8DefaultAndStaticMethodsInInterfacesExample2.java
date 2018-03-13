package com.java.example;

public class Java8DefaultAndStaticMethodsInInterfacesExample2 implements Java8DefaultAndStaticMethodsInInterfacesExample{

	public static void main(String arg[]) {
		Java8DefaultAndStaticMethodsInInterfacesExample2 java8DefaultAndStaticMethodsInInterfacesExample2 = new Java8DefaultAndStaticMethodsInInterfacesExample2();
		java8DefaultAndStaticMethodsInInterfacesExample2.method1();
		
		// This will execute the default implementation available in the interface.
		java8DefaultAndStaticMethodsInInterfacesExample2.log("Message");
	}
	
	@Override
	public void method1() {
		System.out.println("Inside Java8DefaultAndStaticMethodsInInterfacesExample2");
	}

//	public void log(String logMessage) {
//		System.out.println("Inside Java8DefaultAndStaticMethodsInInterfacesExample2 log method");
//	}
}
