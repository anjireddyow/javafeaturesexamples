package com.java.example;

/**
 * If you notice above interfaces code, you will notice @FunctionalInterface
 * annotation. Functional interfaces are new concept introduced in Java 8. An
 * interface with exactly one abstract method becomes Functional Interface. We
 * don’t need to use @FunctionalInterface annotation to mark an interface as
 * Functional Interface. @FunctionalInterface annotation is a facility to avoid
 * accidental addition of abstract methods in the functional interfaces. You can
 * think of it like @Override annotation and it’s best practice to use it.
 * java.lang.Runnable with single abstract method run() is a great example of
 * functional interface.
 * 
 * One of the major benefits of functional interface is the possibility to use
 * lambda expressions to instantiate them. We can instantiate an interface with
 * anonymous class but the code looks bulky.
 * 
 * @author
 *
 */
public interface Java8FunctionalInterfaceExample {

}
