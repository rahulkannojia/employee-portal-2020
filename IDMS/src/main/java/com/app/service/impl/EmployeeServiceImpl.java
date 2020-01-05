package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.entity.Employee;
import com.app.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = empDao.getAllEmployees();
		System.out.println("Employee List in ServiceImpl:::::");
		empList.stream().forEach(System.out::println);
		return empList;
	}

}
