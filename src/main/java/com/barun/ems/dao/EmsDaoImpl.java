/**
 * 
 */
package com.barun.ems.dao;

import java.util.ArrayList;
import java.util.List;

import com.barun.ems.domain.Address;
import com.barun.ems.domain.Competency;
import com.barun.ems.domain.Designation;
import com.barun.ems.domain.Employee;
import com.barun.ems.domain.Role;

/**
 * @author Bibhuti
 *
 */
public class EmsDaoImpl implements EmsDao {

	private List<Employee> employees = new ArrayList<Employee>();
	
	@Override
	public List<Employee> getEmployees() {
		
		return employees;
	}

	@Override
	public Employee getEmployee(String employeeNumber) {
		
		return employees.get(0);
	}

	@Override
	public int createEmployee(Employee employee) {
		employees.add(employee);
		return 1;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(String employeeNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Address> getAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddress(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createAddress(Address address) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Address updateAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAddress(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Competency> getComptencies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Competency getCompetency(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createCompetency(Competency competency) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Competency updateCompetency(Competency competency) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompetency(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Designation> getDesignations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Designation getDesignation(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createDesignation(Designation Designation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Designation updateDesignation(Designation Designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDesignation(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRole(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createRole(Role Role) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Role updateRole(Role Role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRole(long id) {
		// TODO Auto-generated method stub
		
	}

}
