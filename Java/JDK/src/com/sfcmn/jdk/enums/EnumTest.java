package com.sfcmn.jdk.enums;

import static com.sfcmn.jdk.enums.Weekday.*;

public class EnumTest {
  public static void main(String[] args) {
    final Weekday weekday = SUN;
    switch (weekday) {
      case MON, TUE, WED, THU, FRI -> {
        System.out.println("Today is " + weekday + "(" + weekday.name() + " - " + (weekday.ordinal() + 1) + "). Work at office!");
      }
      case SAT, SUN -> {
        System.out.println("Today is " + weekday + "(" + weekday.name() + " - " + (weekday.ordinal() + 1) + "). Work at home!");
      }
      default -> throw new IllegalStateException("cannot process " + weekday);
    }
  }
}
