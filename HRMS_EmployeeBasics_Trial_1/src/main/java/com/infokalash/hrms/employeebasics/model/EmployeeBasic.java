package com.infokalash.hrms.employeebasics.model;


//import java.util.Date;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_basic_details")
public class EmployeeBasic {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "middle_name")
  private String middleName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "age")
  private int age;

  @Column(name = "gender")
  private String gender;

  @Column(name = "date_of_joining")
  private Date dateOfJoining;

  @Column(name = "date_of_birth")
  private Date dateOfBirth;

  @Column(name = "blood_group")
  private String bloodGroup;

  @Column(name = "employee_active_status")
  private byte employeeActiveStatus;

  @Column(name = "last_transaction_id")
  private int lastTransactionId;

  @Column(name = "last_update_user")
  private String lastUpdateUser;

  @Column(name = "last_transaction_date")
  private Date lastTransactionDate;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Date getDateOfJoining() {
	return dateOfJoining;
}

public void setDateOfJoining(Date dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getBloodGroup() {
	return bloodGroup;
}

public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}

public byte getEmployeeActiveStatus() {
	return employeeActiveStatus;
}

public void setEmployeeActiveStatus(byte employeeActiveStatus) {
	this.employeeActiveStatus = employeeActiveStatus;
}

public int getLastTransactionId() {
	return lastTransactionId;
}

public void setLastTransactionId(int lastTransactionId) {
	this.lastTransactionId = lastTransactionId;
}

public String getLastUpdateUser() {
	return lastUpdateUser;
}

public void setLastUpdateUser(String lastUpdateUser) {
	this.lastUpdateUser = lastUpdateUser;
}

public Date getLastTransactionDate() {
	return lastTransactionDate;
}

public void setLastTransactionDate(Date lastTransactionDate) {
	this.lastTransactionDate = lastTransactionDate;
}

   
}