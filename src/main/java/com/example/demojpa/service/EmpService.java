package com.example.demojpa.service;

import com.example.demojpa.entity.Emp;
import com.example.demojpa.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepository empRepository;

    public Boolean add(Emp emp) {
        empRepository.save(emp);
        return true;
    }

    public Iterable<Emp> getAll() {
        return empRepository.findAll();
    }

    public List<Emp> getEmpByName(String name) {
        return empRepository.findEmpByName("%" + name + "%");
    }

    public List<Emp> filterSalaryGreater(Double salary) {
        return empRepository.filterSalaryGreater(salary);
    }

}
