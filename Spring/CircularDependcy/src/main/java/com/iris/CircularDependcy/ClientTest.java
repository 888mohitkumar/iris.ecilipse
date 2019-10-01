package com.iris.CircularDependcy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class ClientTest {
	@Autowired
	Temp temp;
	
	public ClientTest()
	{
		System.out.println("ClientTest class constructer");
	}
}
