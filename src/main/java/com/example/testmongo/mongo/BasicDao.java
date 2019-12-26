package com.example.testmongo.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2019/12/26 16:56
 */
@Repository
public class BasicDao {

    @Autowired
    private MongoTemplate template;


    public void saveData(Map<String, Object> mapData) {
        template.insert(mapData, "demo");
    }
}
