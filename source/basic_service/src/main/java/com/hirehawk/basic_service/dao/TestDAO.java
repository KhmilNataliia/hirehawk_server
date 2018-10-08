package com.hirehawk.basic_service.dao;

import com.hirehawk.basic_service.entity.Test;

public interface TestDAO {

    public Test getTest(Integer id);

    public void addTest(Test test);
}
