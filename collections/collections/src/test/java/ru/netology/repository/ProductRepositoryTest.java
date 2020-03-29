package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ProductRepositoryTest {
  private ProductRepository repository = new ProductRepository();

  @Test
  void shouldAddProduct() {
    repository.add(new Product());
  }

  @Test
  void shouldAddMultipleProducts() {
    Collection<Product> products = new ArrayList<>();
    products.add(new Product());
    products.add(new Product());

    repository.addAll(products);
  }

  @Test
  void shouldAddBook() {
    repository.add(new Book());
  }

  @Test
  void shouldAddMultipleBooks() {
    Collection<Book> books = new ArrayList<>();
    books.add(new Book());
    books.add(new Book());

    boolean removed = repository.addAll(books);
  }
}











