package com.infokalash.hrms.employeebasics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infokalash.hrms.employeebasics.model.EmployeeBasic;


@Repository
public interface EmployeeBasicRepository extends JpaRepository<EmployeeBasic, Long>{

}
