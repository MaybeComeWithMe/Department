package com.example.demo.dao;


import com.example.demo.entity.Departments;
import com.example.demo.model.DepartmentsInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class DepartmentsDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public DepartmentsDAO() {
    }

    public Departments findById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Departments.class, id);
    }
    @Transactional
    public List<DepartmentsInfo> listDepartmentsInfo() {
        String sql = "Select new " + DepartmentsInfo.class.getName()
                + "(e.id,e.name)"
                + " from " + Departments.class.getName() + " e ";
        Session session = this.sessionFactory.getCurrentSession();
        Query<DepartmentsInfo> query = session.createQuery(sql, DepartmentsInfo.class);
        return query.getResultList();
    }
}
