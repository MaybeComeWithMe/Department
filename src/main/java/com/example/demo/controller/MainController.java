package com.example.demo.controller;


import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showEmployees(Model model){
        List<EmployeeInfo> list = employeeDAO.listEmployeeInfo();

        model.addAttribute("employeeInfo",list);

        return "employeePage";
    }
}
