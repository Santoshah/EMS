/**
 * 
 */
package com.barun.ems.domain;

import java.io.Serializable;

/**
 * @author Bibhuti
 *
 */
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String middleName;
	private String lastName;
	private String employeeId;
	private String contactNumber;
	private String email;
	private Address temporaryAddress;
	private Address permanentAddress;
	private Designation designation;
	private Competency competency;
	private Role role;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the temporaryAddress
	 */
	public Address getTemporaryAddress() {
		return temporaryAddress;
	}
	/**
	 * @param temporaryAddress the temporaryAddress to set
	 */
	public void setTemporaryAddress(Address temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}
	/**
	 * @return the permanentAddress
	 */
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	/**
	 * @param permanentAddress the permanentAddress to set
	 */
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	/**
	 * @return the designation
	 */
	public Designation getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	/**
	 * @return the competency
	 */
	public Competency getCompetency() {
		return competency;
	}
	/**
	 * @param competency the competency to set
	 */
	public void setCompetency(Competency competency) {
		this.competency = competency;
	}
	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	
}
