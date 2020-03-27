package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {
  private Product first = new Product(1, "First", 1_000, 3.5);
  private Product second = new Product(2, "Second", 2_000, 4.5);
  private Product third = new Product(3, "Third", 3_000, 5.0);

  @Test
  public void shouldSortById() {
    Product[] expected = new Product[]{first, second, third};
    Product[] actual = new Product[]{third, first, second};

    Arrays.sort(actual);

    assertArrayEquals(expected, actual);
  }
}























