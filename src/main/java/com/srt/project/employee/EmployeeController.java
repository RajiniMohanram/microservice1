package com.srt.project.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/emp-details")
	public String getEmployeeDetails() {
		return "Returning Employee's Details";
	}
}
