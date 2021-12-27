package com.dogtooth.department.service.service;

import com.dogtooth.department.service.entity.Department;
import com.dogtooth.department.service.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {

        log.info("Inside saveDepartment method of DepartmentRepository");
        return departmentRepository.save(department);

    }

    public Department findDepartment(Long departmentId) {

        log.info("Inside findDepartment method of DepartmentRepository");
        return departmentRepository.findByDepartmentId(departmentId);

   }
}
