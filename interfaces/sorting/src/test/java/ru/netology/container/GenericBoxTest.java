package ru.netology.container;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class GenericBoxTest {
  @Test
  public void shouldParametrizedWithProduct() {
    Product product = new Product();
    GenericBox<Product> productBox = new GenericBox<>(product);

    Product value = productBox.getValue();
    assertEquals(product, value);
  }

  @Test
  public void shouldParametrizedWithString() {
    String str = "Hello world";
    GenericBox<String> stringBox = new GenericBox<>(str);

    String value = stringBox.getValue();
    assertEquals(str, value);
  }
}



