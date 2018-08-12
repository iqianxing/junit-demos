package com.test.apitest;

import org.testng.TestNG;
import org.testng.Assert;
import org.testng.annotations.*;
import com.alibaba.fastjson.JSON;
import java.util.Map;

public  class TestNGJsonDiffTest {
    @Test
    public  void  test_json_diff(){
        String oldJson = "{\"title\":\"com.tencent.news\",\"fullTitle\":\"Androbugs report com.tencent.news\",\"timedOut\":false,\"duration\":0,\"state\":\"passed\",\"speed\":\"fast\",\"pass\":true,\"fail\":false,\"pending\":false}";
        String newJson = "{\"title\":\"com.tencent.news2\",\"fullTitle\":\"Androbugs report com.tencent.news2\",\"timedOut\":false,\"duration\":0,\"state\":\"passed\",\"speed\":\"fast\",\"pass\":true,\"fail\":false,\"pending\":false}";

        Map<String,Object> oldJsonVo = (Map<String,Object>)JSON.parseObject(oldJson);
        Map<String,Object> newJsonVo = (Map<String,Object>)JSON.parseObject(newJson);
        Assert.assertEqualsDeep(oldJsonVo,newJsonVo);
    }
}