/**
 * 
 */
package com.barun.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.barun.ems.dao.EmsDao;
import com.barun.ems.domain.Employee;

/**
 * @author Bibhuti
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	EmsDao dao;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getEmployees() {
		return dao.getEmployees();
	}

	@RequestMapping(value = "/employees/{employeeNumber}", method = RequestMethod.GET)
	public @ResponseBody Employee getEmployee(
			@PathVariable(value = "employeeNumber") String employeeNumber) {
		return dao.getEmployee(employeeNumber);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public int createEmployee(@RequestBody Employee employee) {
		return dao.createEmployee(employee);
	}

	@RequestMapping(value = "/employees/{employeeNumber}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Employee updateEmployee(@RequestBody Employee employee) {
		return dao.updateEmployee(employee);
	}

	@RequestMapping(value = "/employees/{employeeNumber}", method = RequestMethod.DELETE)
	public void deleteEmployee(
			@PathVariable(value = "employeeNumber") String employeeNumber) {
		dao.deleteEmployee(employeeNumber);
	}
}
