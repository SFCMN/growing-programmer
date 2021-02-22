package com.sfcmn.jdk14.records;

public class Records {
  public static void main(String[] args) {
    compareCommonDataClass(); // 普通 Data 类，需要构造方法和很多 getter 方法，并且要复写 equals() 和 hashCode() 方法
    compareRecordClass(); // Record 类，编译器自动为我们创建了构造方法，和字段名同名的 getter 方法，以及覆写 toString()、equals() 和 hashCode() 方法。
  }

  private static void compareCommonDataClass() {
    final var point1 = new Point(1, 2);
    final var point2 = new Point(1, 2);
    System.out.println(point1 == point2);
    System.out.println(point1.equals(point2));
  }

  private static void compareRecordClass() {
    final var recordPoint1 = new RecordPoint(1, 2);
    final var recordPoint2 = new RecordPoint(1, 2);
    System.out.println(recordPoint1 == recordPoint2);
    System.out.println(recordPoint1.equals(recordPoint2));
  }
}
