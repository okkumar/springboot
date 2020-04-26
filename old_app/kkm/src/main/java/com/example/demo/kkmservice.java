package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kkm")
public class kkmservice {
	
			
	@RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
	public Employee getEmployeeByName(@PathVariable String name) {

		// pull date

		return employee;
	}

}
