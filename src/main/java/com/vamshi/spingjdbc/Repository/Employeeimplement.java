package com.vamshi.spingjdbc.Repository;

import com.vamshi.spingjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.vamshi.spingjdbc.model.Employee;
import java.util.List;

@Repository
public class Employeeimplement implements Employeeinter{
    @Autowired
    JdbcTemplate jdbcTemplate;
    private final String insert="insert into Employee(empid,empname,Emptech) values(?,?,?)";
    private final String update="Update  Employee set empname=?,Emptech=? where empid =?";
    private final String selectspecfics="select * from Employee where empid=?";
    private final String  Tableview="select * from Employee";

    @Override
    public Employee save(Employee emp) {
        jdbcTemplate.update(insert,emp.getEmpid(),emp.getName(),emp.getTech());
    return emp;
    }

    @Override
    public void Delete(int id) {
jdbcTemplate.update("Delete from Employee where empid=?",id);
    }

    @Override
    public Employee update(Employee emp) {
        jdbcTemplate.update(update,emp.getEmpid(),emp.getName(),emp.getTech());

     return emp;
    }

    @Override
    public List<Employee> allemp() {
    return jdbcTemplate.query(Tableview,(rs, rowNum) -> {
        Employee emp=new Employee();
        emp.setEmpid(rs.getInt("empid"));
        emp.setName(rs.getString("empname"));
        emp.setTech(rs.getString("Emptech"));
    return emp;
    });

    }

    @Override
    public Employee findbyID(int id) {
        return null;
    }
}
