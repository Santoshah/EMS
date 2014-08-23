/**
 * 
 */
package com.barun.ems.dao;

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
public interface EmsDao {

	/**
	 * 
	 * @return
	 */
	List<Employee> getEmployees();
	/**
	 * 
	 * @param employeeNumber
	 * @return
	 */
	Employee getEmployee(String employeeNumber);
	/**
	 * 
	 * @param employee
	 * @return
	 */
	int createEmployee(Employee employee);
	/**
	 * 
	 * @param employee
	 * @return
	 */
	Employee updateEmployee(Employee employee);
	/**
	 * 
	 * @param employeeNumber
	 */
	void deleteEmployee(String employeeNumber);
	/**
	 * 
	 * @return
	 */
	List<Address> getAddresses();
	/**
	 * 
	 * @param id
	 * @return
	 */
	Address getAddress(long id);
	/**
	 * 
	 * @param address
	 * @return
	 */
	int createAddress(Address address);
	/**
	 * 
	 * @param address
	 * @return
	 */
	Address updateAddress(Address address);
	/**
	 * 
	 * @param id
	 */
	void deleteAddress(long id);
	/**
	 * 
	 * @return
	 */
	List<Competency> getComptencies();
	/**
	 * 
	 * @param id
	 * @return
	 */
	Competency getCompetency(long id);
	/**
	 * 
	 * @param competency
	 * @return
	 */
	int createCompetency(Competency competency);
	/**
	 * 
	 * @param competency
	 * @return
	 */
	Competency updateCompetency(Competency competency);
	/**
	 * 
	 * @param id
	 */
	void deleteCompetency(long id);
	/**
	 * 
	 * @return
	 */
	List<Designation> getDesignations();
	/**
	 * 
	 * @param id
	 * @return
	 */
	Designation getDesignation(long id);
	/**
	 * 
	 * @param Designation
	 * @return
	 */
	int createDesignation(Designation Designation);
	/**
	 * 
	 * @param Designation
	 * @return
	 */
	Designation updateDesignation(Designation Designation);
	/**
	 * 
	 * @param id
	 */
	void deleteDesignation(long id);
	/**
	 * 
	 * @return
	 */
	List<Role> getRoles();
	/**
	 * 
	 * @param id
	 * @return
	 */
	Role getRole(long id);
	/**
	 * 
	 * @param Role
	 * @return
	 */
	int createRole(Role Role);
	/**
	 * 
	 * @param Role
	 * @return
	 */
	Role updateRole(Role Role);
	/**
	 * 
	 * @param id
	 */
	void deleteRole(long id);
	
}
