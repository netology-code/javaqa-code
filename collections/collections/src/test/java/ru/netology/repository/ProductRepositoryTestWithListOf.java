package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ProductRepositoryTestWithListOf {
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

    repository.addAll(List.of(new Product(), new Product()));
  }

  @Test
  void shouldAddBook() {
    repository.add(new Book());
  }

  @Test
  void shouldAddMultipleBooks() {
    boolean removed = repository.addAll(List.of(new Product(), new Product()));
  }
}











