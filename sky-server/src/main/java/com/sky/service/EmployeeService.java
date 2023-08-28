package com.sky.service;

import com.github.pagehelper.PageHelper;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

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
    public PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
    public void updateStatus(Integer status, Long id);
    public Employee getById(Long id);
    public void updateEmployee(EmployeeDTO employeeDTO);
}
