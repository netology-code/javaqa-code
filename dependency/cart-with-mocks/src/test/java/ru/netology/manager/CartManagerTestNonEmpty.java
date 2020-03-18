package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.PurchaseItem;
import ru.netology.repository.CartRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CartManagerTestNonEmpty {
  @Mock
  private CartRepository repository;
  @InjectMocks
  private CartManager manager;
  private PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
  private PurchaseItem second = new PurchaseItem(2, 2, "second", 1, 1);
  private PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 1);

  @BeforeEach
  public void setUp() {
    manager.add(first);
    manager.add(second);
    manager.add(third);
  }

  @Test
  public void shouldRemoveIfExists() {
    int idToRemove = 1;
    // настройка заглушки
    PurchaseItem[] returned = new PurchaseItem[]{second, third};
    doReturn(returned).when(repository).findAll();
    doNothing().when(repository).removeById(idToRemove);

    manager.removeById(idToRemove);
    PurchaseItem[] expected = new PurchaseItem[]{third, second};
    PurchaseItem[] actual = manager.getAll();
    assertArrayEquals(expected, actual);

    // удостоверяемся, что заглушка была вызвана с нужным значением
    // но это уже проверка "внутренней" реализации
    verify(repository).removeById(idToRemove);
  }

  @Test
  public void shouldNotRemoveIfNotExists() {
    int idToRemove = 4;
    PurchaseItem[] returned = new PurchaseItem[]{first, second, third};
    doReturn(returned).when(repository).findAll();
    doNothing().when(repository).removeById(idToRemove);

    manager.removeById(idToRemove);
    PurchaseItem[] expected = new PurchaseItem[]{third, second, first};
    PurchaseItem[] actual = manager.getAll();

    assertArrayEquals(expected, actual);
    // удостоверяемся, что заглушка была вызвана с нужным значением
    // но это уже проверка "внутренней" реализации
    verify(repository).removeById(idToRemove);
  }
}