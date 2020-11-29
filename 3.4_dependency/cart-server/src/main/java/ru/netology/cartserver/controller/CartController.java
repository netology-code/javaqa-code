package ru.netology.cartserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.netology.cartserver.domain.PurchaseItem;
import ru.netology.cartserver.service.CartService;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {
  private final CartService service;

  @PostMapping
  public void add(@RequestBody PurchaseItem item) {
    service.add(item);
  }

  @GetMapping
  public PurchaseItem[] getAll() {
    return service.getAll();
  }

  @DeleteMapping("/{id}")
  public void removeById(@PathVariable int id) {
    service.removeById(id);
  }
}
