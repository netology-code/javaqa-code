package ru.netology.container;

public class Box {
  private Object value;

  public Box(Object value) {
    this.value = value;
  }

  public boolean isEmpty() {
    return value == null;
  }

  public Object getValue() {
    return value;
  }
}
