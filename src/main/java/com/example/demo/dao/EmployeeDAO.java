package com.example.demo.dao;

import com.example.demo.entity.Employee;
import com.example.demo.model.EmployeeInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public EmployeeDAO() {
    }

    public Employee findById(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    public List<EmployeeInfo> listEmployeeInfo() {
        String sql = "Select " + EmployeeInfo.class.getName() //
                + "(e.id,e.full_name,e.position,e.salary,e.dateOfbirthday) " //
                + " from " + Employee.class.getName();
        Session session = this.sessionFactory.getCurrentSession();
        Query<EmployeeInfo> query = session.createQuery(sql, EmployeeInfo.class);
        return query.getResultList();
    }

}
