package com.service.impl;

import com.domain.entity.Employee;
import com.domain.mapper.EmployeeMapper;
import com.domain.mapper.UserMapper;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployeeInfo() {
        List<Employee> employees = employeeMapper.getAllEmployee();
        return employees;
    }

    @Override
    public Employee getDetailEmployeeInfo(int employeeid) {
        Employee employee = employeeMapper.getEmployeeById(employeeid);
        return employee;
    }
}
