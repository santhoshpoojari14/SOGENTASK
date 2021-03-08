package com.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portal.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	 @Query("FROM Employee ORDER BY firstName ASC")
	//@Query(value = "SELECT * from Employee  order by firstName asc")
    List<Employee> findEmployeeByAsc(); 
}
