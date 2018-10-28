package com.security.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.security.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/user/getEmployeesList", produces = "application/json")
    @ResponseBody
    public List<Employee> getEmployeesList() {
        List<Employee> employees = new ArrayList<>();
        
        Employee emp1 = new Employee();
        emp1.setEmpId("E001");
        emp1.setEmpName("Krishanthi Amarasinghe");
        employees.add(emp1);
        
        Employee emp2 = new Employee();
        emp2.setEmpId("E002");
        emp2.setEmpName("Dumindu Silva");
        employees.add(emp2);
        
        Employee emp3 = new Employee();
        emp3.setEmpId("E003");
        emp3.setEmpName("Amali Perera");
        employees.add(emp3);
        
        Employee emp4 = new Employee();
        emp4.setEmpId("E004");
        emp4.setEmpName("Wasanthi Chamari");
        employees.add(emp4);
        
        Employee emp5 = new Employee();
        emp5.setEmpId("E005");
        emp5.setEmpName("Nayana Kumari");
        employees.add(emp5);
        
        return employees;

    }
}
