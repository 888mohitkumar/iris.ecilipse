package com.iris.myinterface;

public interface I1 {
	public int id=10;
	public default void temp()
	{
		System.out.println("temp in I1");
	}
}
