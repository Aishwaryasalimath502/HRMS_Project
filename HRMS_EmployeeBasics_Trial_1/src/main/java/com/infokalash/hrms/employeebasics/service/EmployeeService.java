package com.infokalash.hrms.employeebasics.service;

import java.util.List;

import com.infokalash.hrms.employeebasics.model.EmployeeBasic;

public interface EmployeeService {
	List<EmployeeBasic> getAllEmployeeBasics();
    EmployeeBasic getEmployeeBasicById(Long id);
    EmployeeBasic createEmployeeBasic(EmployeeBasic employeeBasic);
    EmployeeBasic updateEmployeeBasic(EmployeeBasic employeeBasic);
    void deleteEmployeeBasic(Long id);

}
