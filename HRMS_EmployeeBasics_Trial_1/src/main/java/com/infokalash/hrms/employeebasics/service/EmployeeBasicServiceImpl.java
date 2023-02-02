package com.infokalash.hrms.employeebasics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokalash.hrms.employeebasics.model.EmployeeBasic;
import com.infokalash.hrms.employeebasics.repository.EmployeeBasicRepository;

@Service
public class EmployeeBasicServiceImpl implements EmployeeService {
    private final EmployeeBasicRepository employeeBasicRepository;

    @Autowired
    public EmployeeBasicServiceImpl(EmployeeBasicRepository employeeBasicRepository) {
        this.employeeBasicRepository = employeeBasicRepository;
    }

    @Override
    public List<EmployeeBasic> getAllEmployeeBasics() {
        return employeeBasicRepository.findAll();
    }

    @Override
    public EmployeeBasic getEmployeeBasicById(Long id) {
        return employeeBasicRepository.findById(id).orElse(null);
    }

    @Override
    public EmployeeBasic createEmployeeBasic(EmployeeBasic employeeBasic) {
        return employeeBasicRepository.save(employeeBasic);
    }

    @Override
    public EmployeeBasic updateEmployeeBasic(EmployeeBasic employeeBasic) {
        return employeeBasicRepository.save(employeeBasic);
    }

    @Override
    public void deleteEmployeeBasic(Long id) {
        employeeBasicRepository.deleteById(id);
    }
}






