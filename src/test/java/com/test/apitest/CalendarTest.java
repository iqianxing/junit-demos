package com.test.apitest;

import org.junit.*;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
  public static Date getMonthEndDate() {
    Calendar ca = Calendar.getInstance();
    ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
    ca.set(Calendar.HOUR_OF_DAY, 23);
    ca.set(Calendar.MINUTE, 59);
    ca.set(Calendar.SECOND, 59);
    return ca.getTime();
  }

  public static Date getNowEndDate() {
    Calendar ca = Calendar.getInstance();
    ca.set(Calendar.HOUR_OF_DAY, 23);
    ca.set(Calendar.MINUTE, 59);
    ca.set(Calendar.SECOND, 59);
    return ca.getTime();
  }

  @Test
  public void test_getMonthEndDate() {
    Date date = getMonthEndDate();
    System.out.println(date);
  }

  @Test
  public void test_getNowEndDate() {
    Date date = getNowEndDate();
    System.out.println(date);
  }

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