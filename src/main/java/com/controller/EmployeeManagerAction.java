package com.controller;

import com.domain.entity.Employee;
import com.domain.entity.JsonResult;
import com.service.EmployeeService;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeManagerAction {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/employeeInfo")
    public String getEmployeeInfo(Model model) {
        List<Employee> employees = employeeService.getAllEmployeeInfo();
        model.addAttribute("employees",employees);
        return "employeeManager";
    }

    @RequestMapping("/getEmployeeInfo")
    @ResponseBody
    public List<Employee> getEmployeeInfo() {
        List<Employee> employees = employeeService.getAllEmployeeInfo();
        return employees;
    }

    /**
     * 根据员工的id查询员工详情信息
     * @param employeeid
     * @return
     */
    @RequestMapping("/getDetailEmployeeInfo")
    @ResponseBody
    public Employee  getEmployeeDetailInfo(int employeeid) {
        Employee employee = employeeService.getDetailEmployeeInfo(employeeid);
        return employee;
    }

    /**
     * 保存员工信息
     * @param employee
     * @return
     */
    @RequestMapping("/getDetailEmployeeInfo")
    @ResponseBody
    public JsonResult saveEmployeeInfo(Employee employee){
        JsonResult result = new JsonResult();
        employeeService.
    }
}
