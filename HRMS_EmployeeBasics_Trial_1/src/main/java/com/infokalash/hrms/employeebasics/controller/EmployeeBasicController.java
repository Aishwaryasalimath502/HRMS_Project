package com.infokalash.hrms.employeebasics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infokalash.hrms.employeebasics.model.EmployeeBasic;
import com.infokalash.hrms.employeebasics.service.EmployeeService;

@RestController
@RequestMapping("/api/employeeBasics")
public class EmployeeBasicController {
  
  @Autowired
  private EmployeeService employeeBasicService;
 

  @PostMapping
  public ResponseEntity<EmployeeBasic> addEmployeeBasic(@RequestBody EmployeeBasic employeeBasic) {
    EmployeeBasic newEmployeeBasic = employeeBasicService.createEmployeeBasic(employeeBasic);
    return new ResponseEntity<>(newEmployeeBasic, HttpStatus.CREATED);
  }

  @GetMapping("/api")
  public ResponseEntity<List<EmployeeBasic>> getAllEmployeeBasics() {
    List<EmployeeBasic> employeeBasics = employeeBasicService.getAllEmployeeBasics();
    return new ResponseEntity<>(employeeBasics, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<EmployeeBasic> getEmployeeBasicById(@PathVariable Long id) {
    EmployeeBasic employeeBasic = employeeBasicService.getEmployeeBasicById(id);
    return new ResponseEntity<>(employeeBasic, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<EmployeeBasic> updateEmployeeBasic(@PathVariable Long id, @RequestBody EmployeeBasic employeeBasic) {
    EmployeeBasic updatedEmployeeBasic = employeeBasicService.updateEmployeeBasic(employeeBasic);
    return new ResponseEntity<>(updatedEmployeeBasic, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteEmployeeBasic(@PathVariable Long id) {
    employeeBasicService.deleteEmployeeBasic(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}