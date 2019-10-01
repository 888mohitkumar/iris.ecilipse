package com.iris.app.StydentSpringBootApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iris.app.StydentSpringBootApp.Bean.Student;

@RestController
public class StudentController {
	@GetMapping(value="/student")
	//@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello()
	{
		return "hello world strudent";
	}
	
	@GetMapping(value="/")
	public List<Student> getMessage()
	{
		List l = new ArrayList<>();
		l.add(new Student(100, "RAM"));
		l.add(new Student(101, "KUSH"));
		
		
		return l;
	}
}
