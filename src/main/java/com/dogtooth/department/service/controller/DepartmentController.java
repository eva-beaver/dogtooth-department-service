package com.dogtooth.department.service.controller;

import com.dogtooth.department.service.entity.Department;
import com.dogtooth.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {

        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/{id}")
    public Department findDepartment(@PathVariable("id") Long departmentId) {

        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartment(departmentId);

    }


}
