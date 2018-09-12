package com.example.demo.dao;

import com.example.demo.entity.Employee;
import com.example.demo.exception.SalaryTransactionException;
import com.example.demo.model.EmployeeInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
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
        String sql = "Select new " + EmployeeInfo.class.getName() //
                + "(e.id,e.full_name,e.position,e.salary,e.dateOfBirthday,e.depId)"
                + " from " + Employee.class.getName();
        Session session = this.sessionFactory.getCurrentSession();
        Query<EmployeeInfo> query = session.createQuery(sql, EmployeeInfo.class);
        return query.getResultList();
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void addAmount(Long id, double salary) throws SalaryTransactionException {
        Employee employee = this.findById(id);
        if (employee == null) {
            throw new SalaryTransactionException("Account not found " + id);
        }
        double newBalance = employee.getSalary() + salary;
        if (employee.getSalary() + salary < 0) {
            throw new SalaryTransactionException(
                    "The money in the account '" + id + "' is not enough (" + employee.getSalary() + ")");
        }
        employee.setSalary(newBalance);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = SalaryTransactionException.class)
    public void sendMoney(Long fromAccountId, Long toAccountId, double salary) throws SalaryTransactionException {
        addAmount(toAccountId, salary);
        addAmount(fromAccountId, -salary);
    }

}
