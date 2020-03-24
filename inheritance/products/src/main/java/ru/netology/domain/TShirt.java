package ru.netology.domain;

import java.util.Objects;

public class TShirt extends Product {
  private String color;
  private String size;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    TShirt shirt = (TShirt) o;
    return Objects.equals(color, shirt.color) &&
        Objects.equals(size, shirt.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), color, size);
  }
}
