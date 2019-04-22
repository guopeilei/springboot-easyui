package com.domain.mapper;

import com.domain.entity.Employee;
import com.domain.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "employeeMapper")
public interface EmployeeMapper {
    /**
     * 查询所有状态正常的员工信息
     * @return
     */
    @Select("SELECT employeeid,employeename,age,image,video ,address,phone,mail,employeedesc FROM employee WHERE status ='1' ")
    List<Employee> getAllEmployee();

    /**
     * 查询所有状态正常的员工信息
     * @return
     */
    @Select("SELECT employeeid,employeename,age,image,video ,address,phone,mail,employeedesc FROM employee WHERE status ='1' and employeeid=#{employeeid}")
    Employee getEmployeeById(int employeeid);
}
