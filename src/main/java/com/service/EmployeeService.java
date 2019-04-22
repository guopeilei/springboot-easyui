package com.service;

import com.domain.entity.Employee;
import com.domain.entity.User;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询所有的员工信息
     * @return
     */
    public List<Employee> getAllEmployeeInfo();

    /**
     * 根据员工id查询员工信息
     * @param employeeid 员工id
     * @return
     */
    public Employee getDetailEmployeeInfo(int employeeid);

    public Employee
}

