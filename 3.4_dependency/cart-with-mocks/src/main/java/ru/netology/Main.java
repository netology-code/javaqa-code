package ru.netology;

import ru.netology.domain.PurchaseItem;
import ru.netology.repository.CartRepository;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Just simple demo for repository with http client (use server from ../cart-server)
    CartRepository repository = new CartRepository("http://localhost:8080/api/cart");
    System.out.println(Arrays.toString(repository.findAll()));
    repository.save(new PurchaseItem(1, 1, "first", 100, 2));
    System.out.println(Arrays.toString(repository.findAll()));
    repository.removeById(1);
    System.out.println(Arrays.toString(repository.findAll()));
  }
}
