package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class Book extends Product {
  private String author;
  private int pages;

  public Book(int id, String name, int price, double rating, String author, int pages) {
    super(id, name, price, rating);
    this.author = author;
    this.pages = pages;
  }
}
