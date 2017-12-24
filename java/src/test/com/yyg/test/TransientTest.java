package com.yyg.test;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransientTest {

    @Test
    public void testTransientClass() {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("test1", "value1");
        testMap.put("test2", "value2");
        testMap.put("test3", "value1");
        testMap.put("test4", "value1");
        testMap.put("test5", "value1");
        testMap.put("test6", "value1");
        testMap.put("test7", "value1");
        testMap.put("test8", "value1");
        testMap.put("test9", "value1");
        testMap.put("test10", "value1");
        testMap.put("test11", "value1");
        testMap.put("test12", "value1");
        testMap.put("test13", "value1");
        List<Long> l = new ArrayList<>();
        l.add(1L);
        l.add(2L);
        l.add(3L);
        l.add(4L);
        l.add(5L);
        l.add(6L);
        l.add(7L);
        l.add(8L);
        l.add(9L);
        l.add(10L);
        l.add(11L);




    }
}

class TransientClass {
    private String a = "aaaa";
    private transient  String b = "bbb";
}
