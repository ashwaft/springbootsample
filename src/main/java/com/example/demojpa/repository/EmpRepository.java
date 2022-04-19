package com.example.demojpa.repository;

import com.example.demojpa.entity.Emp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// Provides inbuilt mechanism to fetch data to database
@Repository
public interface EmpRepository extends CrudRepository<Emp, Long> {

    @Query(value="SELECT * FROM emp WHERE name like :name", nativeQuery = true)
    List<Emp> findEmpByName(@Param("name") String name);

    @Query(value="SELECT * FROM emp WHERE salary > :salary", nativeQuery = true)
    List<Emp> filterSalaryGreater(@Param("salary") Double salary);

}
