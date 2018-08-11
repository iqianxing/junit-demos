package com.test.apitest;

import com.alibaba.fastjson.JSON;
import  org.junit.*;

import java.util.Map;

public  class JunitJsonDiffTest {

    @Test
    public  void  key_order_is_same(){
        String oldJson = "{\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"hello\":\"world\",\"success\":true}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  key_order_is_different_value_is_different(){
        String oldJson = "{\"hello\":\"world\",\"success\":true}";
        String newJson = "{\"hello\":\"world\",\"success\":true}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }

    @Test
    public  void  fastjsonDiff(){
        String oldJson = "{\"title\":\"com.tencent.news\",\"fullTitle\":\"Androbugs report com.tencent.news\",\"timedOut\":false,\"duration\":0,\"state\":\"passed\",\"speed\":\"fast\",\"pass\":true,\"fail\":false,\"pending\":false}";
        String newJson = "{\"title\":\"com.tencent.news2\",\"fullTitle\":\"Androbugs report com.tencent.news2\",\"timedOut\":false,\"duration\":0,\"state\":\"passed\",\"speed\":\"fast\",\"pass\":true,\"fail\":false,\"pending\":false}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEquals(oldJsonVo,newJsonVo);
    }


}