package com.vamshi.spingjdbc.Controller;

import com.vamshi.spingjdbc.Repository.Employeeimplement;
import com.vamshi.spingjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employeecontroller {
    @Autowired
    Employeeimplement employeeimplement;
    @GetMapping("/allemployee")
    public List<Employee> getallmyemployee(){
       return employeeimplement.allemp();

    }
    @PostMapping("/employee")
    public Employee Insertintoemp(@RequestBody Employee employee){
        return employeeimplement.save(employee);
    }
    @PutMapping("/employee/{id}")
    public Employee update(@PathVariable int id, @RequestBody Employee emp) {
        Employee existingEmployee = employeeimplement.findbyID(id);


        existingEmployee.setName(emp.getName());
        existingEmployee.setTech(emp.getTech());

        return employeeimplement.update(existingEmployee);
    }
    @DeleteMapping("/employee/{id}")
    public void delete(@PathVariable int id){
        employeeimplement.Delete(id);
    }
}
