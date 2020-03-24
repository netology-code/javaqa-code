package ru.netology.domain;

import java.util.Objects;

public class Book extends Product {
  private String author;
  private int pages;
  private int publishedYear;

  public Book() {
    super();
  }

  public Book(int id, String name, int price, String author, int pages, int publishedYear) {
    super(id, name, price);
    this.author = author;
    this.pages = pages;
    this.publishedYear = publishedYear;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public int getPublishedYear() {
    return publishedYear;
  }

  public void setPublishedYear(int publishedYear) {
    this.publishedYear = publishedYear;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Book book = (Book) o;
    return pages == book.pages &&
        publishedYear == book.publishedYear &&
        Objects.equals(author, book.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), author, pages, publishedYear);
  }

  @Override
  public String toString() {
    return "Book{" +
        "author='" + author + '\'' +
        ", pages=" + pages +
        ", publishedYear=" + publishedYear +
        '}';
  }
}
