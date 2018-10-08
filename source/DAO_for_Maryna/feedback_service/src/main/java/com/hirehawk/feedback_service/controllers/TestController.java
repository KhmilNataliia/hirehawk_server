package com.hirehawk.feedback_service.controllers;

import com.hirehawk.feedback_service.dao.FeedbackDAO;
import com.hirehawk.feedback_service.dao.USERROLE;
import com.hirehawk.feedback_service.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;


@Controller
@Transactional
public class TestController {

    @Autowired
    private FeedbackDAO feedbackDAO;

    @RequestMapping("/")
    public String home() {
        feedbackDAO.saveFeedback(4, "some comment", new Date(2018,10,8,18,28,20),
                1, 2, USERROLE.GIVER);
        feedbackDAO.saveFeedback(3, new Date(2018,10,8,17,10,20),
                1, 2, USERROLE.GIVER);
        feedbackDAO.saveFeedback(2, "some another comment", new Date(2018,10,8,18,10,20),
                1, 2, USERROLE.GIVER);

        List<Feedback> feedbacks = feedbackDAO.getFeedbacks(2, USERROLE.GIVER);
        System.out.println(feedbacks.size());
        feedbacks = feedbackDAO.getFeedbacksWithoutComments(2, USERROLE.GIVER);
        System.out.println(feedbacks.size());
        feedbacks = feedbackDAO.getFeedbacksWithComments(2, USERROLE.GIVER);
        System.out.println(feedbacks.size());
        return "index";
    }
}

