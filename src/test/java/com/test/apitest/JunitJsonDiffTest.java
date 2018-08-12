package com.test.apitest;

import com.alibaba.fastjson.JSON;
import  org.junit.*;

import java.util.Map;

public  class JunitJsonDiffTest {

    @Test
    public  void  test_json_same_keys(){
        String oldJson = "{\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"hello\":\"world\",\"success\":true}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  test_json_diff_keyOrders(){
        String oldJson = "{\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"success\":true,\"hello\":\"world\"}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  test_json_diff_values(){
        String oldJson = "{\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"success\":true,\"hello\":\"wOrld\"}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  test_json_diff_sub_nodes(){
        String oldJson = "{\"user\":{\"name\":\"devops\",\"age\":10},\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"success\":true,\"hello\":\"wOrld\",\"user\":{\"name\":\"test\",\"age\":10}}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  test_json_with_chinese(){
        String oldJson = "{\"hello\":\"你好\",\"success\":true}";
        String newJson = "{\"success\":true,\"hello\":\"你好吗\"}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  test_json_with_date(){
        String oldJson = "{\"hello\":\"你好\",\"success\":true,\"birthDay\":\"1995-06-15 10:05:00\"}";
        String newJson = "{\"hello\":\"你好\",\"success\":true,\"birthDay\":\"1995-06-15 20:05:00\"}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

}