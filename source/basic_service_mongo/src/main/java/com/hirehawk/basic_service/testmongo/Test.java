package com.hirehawk.basic_service.testmongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tests")
public class Test {

    @Id
    private long id;

    @Indexed(unique = true)
    private String test;

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}