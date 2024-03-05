package com.vamshi.spingjdbc.Repository;

import com.vamshi.spingjdbc.model.Employee;

import java.util.List;

public interface Employeeinter {
    public Employee save(Employee emp);
    public void Delete(int id);
    public Employee update(Employee emp);
    public List<Employee> allemp();
    public Employee findbyID(int id);
}
