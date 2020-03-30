package ru.netology.container;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
  @Test
  public void shouldSaveAndReturnValue() {
    Product product = new Product();
    Box box = new Box(product);

    Object value = box.getValue();
    assertEquals(product, value);
  }
}



