package com.java.example;

/**
 * Java provides a facility to create default methods inside the interface.
 * Methods which are defined inside the interface and tagged with default
 * keyword are known as default methods. These methods are non-abstract methods
 * and can have method body.
 * 
 * @author
 *
 */
@FunctionalInterface
public interface Java8DefaultAndStaticMethodsInInterfacesExample {

	void method1();

	default void log(String str) {
		System.out.println("Java8DefaultAndStaticMethodsInInterfacesExample: Now interfaces will have default implementation of the method using default and Static");
	}

	// trying to override Object method gives compile time error as
	// "A default method cannot override a method from java.lang.Object"

	// default String toString(){
	// return "i1";
	// }

}
