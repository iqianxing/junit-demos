package com.test.apitest;

import org.junit.*;

public class CounterTest {
  @Test
  public void test_add() {
    int addRes = add(add(1));
    System.out.println("result: " + addRes);
  }

  public static int add(int count) {
    int result = count++;
    return result;
  }
}