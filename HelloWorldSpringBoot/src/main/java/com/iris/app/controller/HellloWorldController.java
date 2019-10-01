package com.iris.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloWorldController {
	
	@RequestMapping(value="/") 
	public String hello()
	{
		return "Hello world first app";
	}
}
