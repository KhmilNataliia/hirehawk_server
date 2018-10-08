package com.hirehawk.basic_service.controllers;

import com.hirehawk.basic_service.dao.TestDAO;
import com.hirehawk.basic_service.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Transactional
public class TestController {

    @Autowired
    private TestDAO testDAO;

    @RequestMapping("/")
    public String home() {
        Test test = new Test(); test.setTest("test 1"); test.setId(3);
        testDAO.addTest(test);
        System.out.println(testDAO.getTest(1));
        return "index";
    }
}
