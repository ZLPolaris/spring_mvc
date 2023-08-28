package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     *
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 用于添加新的用户
     *
     * @param employeeDTO 前端给的用户信息
     */
    public void insertEmployee(EmployeeDTO employeeDTO);

}
