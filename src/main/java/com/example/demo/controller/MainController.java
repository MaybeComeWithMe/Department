package com.example.demo.controller;

import com.example.demo.dao.DepartmentsDAO;
import com.example.demo.dao.EmployeeDAO;
import com.example.demo.exception.SalaryTransactionException;
import com.example.demo.form.SendMoneyForm;
import com.example.demo.model.DepartmentsInfo;
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

    @Autowired
    DepartmentsDAO departmentsDAO;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String showDepartments(Model model){
        List<DepartmentsInfo> list = departmentsDAO.listDepartmentsInfo();

        model.addAttribute("departmentInfos", list);

        return "departmentsPage";
    }


    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String showEmployees(Model model){
        List<EmployeeInfo> list = employeeDAO.listEmployeeInfo();

        model.addAttribute("accountInfos",list);

        return "accountsPage";
    }

    @RequestMapping(value = "/sendMoney", method = RequestMethod.GET)
    public String viewSendMoneyPage(Model model) {

        SendMoneyForm form = new SendMoneyForm(1L, 2L, 700d);

        model.addAttribute("sendMoneyForm", form);

        return "sendMoneyPage";
    }

    @RequestMapping(value = "/sendMoney", method = RequestMethod.POST)
    public String processSendMoney(Model model, SendMoneyForm sendMoneyForm) {

        System.out.println("Send Money::" + sendMoneyForm.getAmount());

        try {
            employeeDAO.sendMoney(sendMoneyForm.getFromAccountId(), //
                    sendMoneyForm.getToAccountId(), //
                    sendMoneyForm.getAmount());
        } catch (SalaryTransactionException e) {
            model.addAttribute("errorMessage", "Error: " + e.getMessage());
            return "/sendMoneyPage";
        }
        return "redirect:/";
    }
}
