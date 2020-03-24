package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
  @Test
  public void shouldHaveAllFieldsAndMethodFromSuperClass() {
    Book book = new Book();
//    book.
  }

  @Test
  public void shouldCastFromBaseClass() {
    Product product = new Book();
    if (product instanceof Book) {
      Book book = (Book) product;
//      book.
    }
  }

  @Test
  public void shouldNotCastToDifferentClass() {
    Product product = new Book();
    TShirt shirt = (TShirt) product;
  }

  @Test
  public void shouldUseOverridedMethod() {
    Product product = new Book();
    // Вопрос к аудитории: чей метод вызовется?
    product.toString();
  }
}
