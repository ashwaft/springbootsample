package com.example.demojpa.controller;

import com.example.demojpa.entity.Emp;
import com.example.demojpa.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping("/saveemp")
    public Boolean saveEmp(@RequestBody Emp emp) {
        return empService.add(emp);
    }

    @GetMapping("/getall")
    public Iterable<Emp> findall() {
        return empService.getAll();
    }

    @GetMapping("/getempbyname")
    public List<Emp> findEmpByName(@RequestParam String name) {
        return empService.getEmpByName(name);
    }

    @GetMapping("/filtersalary")
    public List<Emp> filterSalaryGreater(@RequestParam Double salary) {
        return empService.filterSalaryGreater(salary);
    }

    @GetMapping("/filtersalaryfrompath/{salary}")
    public List<Emp> filterSalaryGreaterFromPath(@PathVariable Double salary) {
        return empService.filterSalaryGreater(salary);
    }


}
