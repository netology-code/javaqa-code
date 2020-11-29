package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.PurchaseItem;
import ru.netology.repository.CartRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CartManagerTestNonEmpty {
  @Mock
  private CartRepository repository;
  @InjectMocks
  private CartManager manager;
  private PurchaseItem first = new PurchaseItem(1, 1, "first", 100, 2);
  private PurchaseItem second = new PurchaseItem(2, 2, "second", 10, 1);
  private PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 2);

  @Test
  public void shouldCalculateSum() {
    // настройка заглушки
    PurchaseItem[] returned = new PurchaseItem[]{first, second, third};
    doReturn(returned).when(repository).findAll();

    int expected = 212;
    int actual = manager.sum();
    assertEquals(expected, actual);

    // удостоверяемся, что заглушка была вызвана
    // но это уже проверка "внутренней" реализации
    verify(repository).findAll();
  }
}
