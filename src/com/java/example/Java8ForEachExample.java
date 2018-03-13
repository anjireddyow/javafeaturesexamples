package com.java.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Example of Java 8 For Each example.
 * 
 * Java provides a new method forEach() to iterate the elements. It is defined
 * in Iterable and Stream interfaces.
 * 
 * It is a default method defined in the Iterable interface. Collection classes
 * which extends Iterable interface can use forEach() method to iterate
 * elements.
 * 
 * This method takes a single parameter which is a functional interface. So, you
 * can pass lambda expression as an argument.
 * 
 * @author
 *
 */
public class Java8ForEachExample {

	public static void main(String[] args) {
		forEachExample();
	}

	/**
	 * Iterating list in old fashion before Java 8
	 * 
	 * Iterating list in new fashion using java 8 for each method
	 */
	public static void forEachExample() {
		List<Integer> integerList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			integerList.add(i);
		}
		
		// Iterating list in old fashion before Java 8
		Iterator<Integer> integerItr = integerList.iterator();
		while(integerItr.hasNext()) {
			Integer integerValue = integerItr.next();
			System.out.println("Integer value in before java 8 code:"+integerValue.toString());
		}
		
		// Iterating list in new fashion using java 8 for each method
		integerList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer integer) {
				// TODO Auto-generated method stub
				System.out.println("Integer value after implemeting Java 8 for each method:"+integer);
			}
			
		});
	}

}
