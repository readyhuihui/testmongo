package com.example.testmongo.test;

import com.example.testmongo.TestmongoApplication;
import com.example.testmongo.mongo.BasicDao;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:lyh
 * @Description:测试类
 * @Date:Created in 2019/12/26 17:04
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestmongoApplication.class)
public class MainTest {

    @Autowired
    private BasicDao basicDao;

    @Test
    public void testAdd() {
        Map<String, Object> mapData = new HashMap<String, Object>();
        mapData.put("_id", new ObjectId());
        mapData.put("name", "张三3");
        mapData.put("age", 123);
        mapData.put("address", "北京");
        System.out.println("输出参数："+mapData);
        basicDao.saveData(mapData);
    }
}
