package com.test.apitest;

import com.alibaba.fastjson.JSON;
import org.junit.*;

public class JunitJsonDiffTest {
  @Test
  public void test_json_same_keys() {
    String oldJson = "{\"hello\":\"world\",\"success\":true}";
    String newJson = "{\"hello\":\"world\",\"success\":true}";

    Object oldJsonVo = JSON.parseObject(oldJson);
    Object newJsonVo = JSON.parseObject(newJson);
    Assert.assertEquals(oldJsonVo, newJsonVo);
  }

  @Test
  public void test_json_diff_keyOrders() {
    String oldJson = "{\"hello\":\"world\",\"success\":true}";
    String newJson = "{\"success\":true,\"hello\":\"world\"}";

    Object oldJsonVo = JSON.parseObject(oldJson);
    Object newJsonVo = JSON.parseObject(newJson);
    Assert.assertEquals(oldJsonVo, newJsonVo);
  }

  @Test
  public void test_json_diff_values() {
    String oldJson = "{\"hello\":\"world\",\"success\":true}";
    String newJson = "{\"success\":true,\"hello\":\"wOrld\"}";

    Object oldJsonVo = JSON.parseObject(oldJson);
    Object newJsonVo = JSON.parseObject(newJson);
    Assert.assertEquals(oldJsonVo, newJsonVo);
  }

  @Test
  public void test_json_diff_sub_nodes() {
    String oldJson = "{\"user\":{\"name\":\"devops\",\"age\":10},\"hello\":\"world\",\"success\":true}";
    String newJson = "{\"success\":true,\"hello\":\"wOrld\",\"user\":{\"name\":\"test\",\"age\":10}}";

    Object oldJsonVo = JSON.parseObject(oldJson);
    Object newJsonVo = JSON.parseObject(newJson);
    Assert.assertEquals(oldJsonVo, newJsonVo);
  }

  @Test
  public void test_json_with_chinese() {
    String oldJson = "{\"hello\":\"你好\",\"success\":true}";
    String newJson = "{\"success\":true,\"hello\":\"你好吗\"}";

    Object oldJsonVo = JSON.parseObject(oldJson);
    Object newJsonVo = JSON.parseObject(newJson);
    Assert.assertEquals(oldJsonVo, newJsonVo);
  }

  @Test
  public void test_json_with_date() {
    String oldJson = "{\"hello\":\"你好\",\"success\":true,\"birthDay\":\"1995-06-15 10:05:00\"}";
    String newJson = "{\"hello\":\"你好\",\"success\":true,\"birthDay\":\"1995-06-15 20:05:00\"}";

    Object oldJsonVo = JSON.parseObject(oldJson);
    Object newJsonVo = JSON.parseObject(newJson);
    Assert.assertEquals(oldJsonVo, newJsonVo);
  }

}