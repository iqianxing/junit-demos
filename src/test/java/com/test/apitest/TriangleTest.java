package com.test.apitest;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class TriangleTest {
  @Test
  public void test_invalid_params() {
    boolean isValid = Triangle.isValidTriangle(-1, 10, 2);
    Assert.assertEquals(isValid, false);
  }

  @Test
  public void test_invalid_triangle() {
    boolean isValid = Triangle.isValidTriangle(2, 19, 5);
    Assert.assertEquals(isValid, false);
  }

  @Test
  public void test_valid_triangle() {
    boolean isValid = Triangle.isValidTriangle(20, 19, 30);
    Assert.assertEquals(isValid, true);
  }
}
