package com.iris.CircularDependcy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("In BeanPostProcessor postProcessAfterInitialization");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("In BeanPostProcessor postProcessBeforeInitialization");
		return arg0;
	}

}