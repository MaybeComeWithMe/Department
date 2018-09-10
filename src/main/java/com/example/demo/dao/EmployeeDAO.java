package com.example.demo.dao;

import com.example.demo.entity.Employee;
import com.example.demo.model.EmployeeInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
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
        String sql = "Select new " + EmployeeInfo.class.getName() + "(e.id,e.full_name,e.position,e.salary,e.dateOfBirthday,e.depId) "
                + " from " + Employee.class.getName() + " e ";
        Session session = this.sessionFactory.getCurrentSession();
        Query<EmployeeInfo> query = session.createQuery(sql, EmployeeInfo.class);
        return query.getResultList();
    }

}
