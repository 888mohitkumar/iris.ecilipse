package com.iris;

@FunctionalInterface
public interface MyInterface {

	public abstract void method1();
	
	public int hashCode();
	public default void method2() {
	}
}
