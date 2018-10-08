package com.hirehawk.basic_service.dao;

import com.hirehawk.basic_service.BasicServiceApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hirehawk.basic_service.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TestDAOImpl implements TestDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public Test getTest(Integer id){
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(Test.class, id);
    }

    public void addTest(Test test){
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(test);
        session.flush();
    }
}
