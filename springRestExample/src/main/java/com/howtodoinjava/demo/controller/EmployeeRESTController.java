package com.howtodoinjava.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.modal.EmployeeListVO;
import com.howtodoinjava.demo.modal.EmployeeVO;

@RestController
public class EmployeeRESTController {
	@PostMapping(value = "/create", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeVO createEmployee() {
		return new EmployeeVO(1, "Mohit", "Kumar", "howtodoinjava@gmail.com");
	}

	@RequestMapping(value = "/employees")
	public EmployeeListVO getAllEmployees() {
		final EmployeeListVO employees = new EmployeeListVO();

		final EmployeeVO empOne = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
		final EmployeeVO empTwo = new EmployeeVO(2, "Amit", "Singhal", "asinghal@yahoo.com");
		final EmployeeVO empThree = new EmployeeVO(3, "Kirti", "Mishra", "kmishra@gmail.com");

		employees.getEmployees().add(empOne);
		employees.getEmployees().add(empTwo);
		employees.getEmployees().add(empThree);

		return employees;
	}

	@RequestMapping(value = "/employees/{id}")
	public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable("id") final int id) {
		if (id <= 3) {
			final EmployeeVO employee = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
			return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
}
