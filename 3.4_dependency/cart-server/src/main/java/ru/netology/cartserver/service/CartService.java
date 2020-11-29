package ru.netology.cartserver.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.cartserver.domain.PurchaseItem;
import ru.netology.cartserver.repository.CartRepository;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CartService {
  private final CartRepository repository;

  public void add(PurchaseItem item) {
    repository.save(item);
  }

  public PurchaseItem[] getAll() {
    return repository.findAll().toArray(new PurchaseItem[]{});
  }

  public void removeById(int id) {
    repository.deleteById(id);
  }
}
