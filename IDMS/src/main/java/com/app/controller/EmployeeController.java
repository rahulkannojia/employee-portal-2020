package com.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Employee;
import com.app.service.EmployeeService;

@Controller
@RequestMapping("/vendor")
public class EmployeeController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeService empService;

	@RequestMapping("/welcome")
	public String index() {
		return "index";	
	}
	
	@RequestMapping("/employees")
	public String getAllEmployee(ModelMap map) {
		
		logger.info("employee List:::");
		List<Employee> empList = empService.getAllEmployees();
		map.addAttribute("list", empList);
		return "employee";
		
	}
	

}
