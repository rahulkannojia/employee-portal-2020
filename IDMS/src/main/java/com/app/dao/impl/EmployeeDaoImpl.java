package com.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.app.controller.EmployeeController;
import com.app.dao.EmployeeDao;
import com.app.entity.Employee;
import com.app.util.CommonConstant;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);
	@Autowired
	private JdbcTemplate jt;
	@Override
	public List<Employee> getAllEmployees() {
		return getAllEmployeesRowMapper();
	}
	
	private List<Employee> getAllEmployeesRowMapper(){
	
		   return jt.query(CommonConstant.EMPLIST,new RowMapper<Employee>(){  
		      @Override  
		      public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		          Employee e=new Employee();  
		          e.setEmpId(rs.getLong(1));  
		          e.setEname(rs.getString(2));  
		          e.setSalary(rs.getDouble(6));
		          e.setMgr(rs.getInt(4));
		          e.setJob(rs.getString(3));
		          e.setHiredate(rs.getDate(5));
		          logger.info("employee List:::");
		          return e;  
		      }  
		      });  
		  }  

}
