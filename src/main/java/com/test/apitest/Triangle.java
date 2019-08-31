package com.test.apitest;

public class Triangle {

  public static boolean isValidTriangle(int a, int b, int c) {
    if (a < 1 || b < 1 || c < 1 || a > 100 || b > 100 || c > 100) {
      // 边长超出[1,100]区间范围
      return false;
    }

    if (a + b <= c || a + c <= b || b + c <= a) {
      // 两边之和应该大于第三条边
      return false;
    }

    return true;
  }
}
