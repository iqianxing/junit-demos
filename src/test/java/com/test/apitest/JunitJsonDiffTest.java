package com.test.apitest;

import com.alibaba.fastjson.JSON;
import  org.junit.*;

import java.util.Map;

public  class JunitJsonDiffTest {

    @Test
    public  void  test_keyOrder_is_same(){
        String oldJson = "{\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"hello\":\"world\",\"success\":true}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  test_keyOrder_is_different(){
        String oldJson = "{\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"success\":true,\"hello\":\"world\"}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  test_json_differert(){
        String oldJson = "{\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"success\":true,\"hello\":\"wOrld\"}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  test_jsonTree_differert(){
        String oldJson = "{\"user\":{\"name\":\"devops\",\"age\":10},\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"success\":true,\"hello\":\"wOrld\",\"user\":{\"name\":\"test\",\"age\":10}}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

}