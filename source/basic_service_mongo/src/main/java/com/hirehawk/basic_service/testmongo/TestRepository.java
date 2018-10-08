package com.hirehawk.basic_service.testmongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

// No need implementation, just one interface, and you have CRUD, thanks Spring Data
public interface TestRepository extends MongoRepository<Test, Long> {

    Test findByTest(String test);

    Test findById(long id);

}
