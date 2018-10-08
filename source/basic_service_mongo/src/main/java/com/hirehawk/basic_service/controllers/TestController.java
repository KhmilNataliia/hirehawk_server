package com.hirehawk.basic_service.controllers;


import com.hirehawk.basic_service.testmongo.Test;
import com.hirehawk.basic_service.testmongo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Transactional
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @RequestMapping("/")
    public String home() {
        Test test = new Test(); test.setId(3); test.setTest("test 3");
        testRepository.save(test);
        System.out.println(testRepository.findById(1));
        return "index.html";
    }
}
