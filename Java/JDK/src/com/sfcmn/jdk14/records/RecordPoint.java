package com.sfcmn.jdk14.records;

public record RecordPoint(int x, int y) {
  // 【Record 类】可以给构造方法添加验证逻辑
  public RecordPoint {
    if (x < 0 || y < 0) {
      throw new IllegalArgumentException();
    }
  }

  // 【Record 类】可以添加一些静态方法
  public static RecordPoint of() {
    return new RecordPoint(0, 0);
  }

  public static RecordPoint of(int x, int y) {
    return new RecordPoint(x, y);
  }
}
