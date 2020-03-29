package ru.netology.repository;

import ru.netology.domain.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// FIXME: ВАЖНО не оставляйте код в таком виде (закомментированном) в ваших ДЗ!
// FIXME: мы так сделали ТОЛЬКО для удобства демонстрации

// first version without wildcard
//public class ProductRepository {
//  private Collection<Product> items = new ArrayList<>();
//
//  public Collection<Product> getAll() {
//    return items;
//  }
//
//  public Product getById(int id) {
//    for (Product item : items) {
//      if (item.getId() == id) {
//        return item;
//      }
//    }
//    return null;
//  }
//
//  public boolean add(Product item) {
//    return items.add(item);
//  }
//
//  public boolean remove(Product item) {
//    return items.remove(item);
//  }
//
//  public boolean addAll(Collection<Product> items) {
//    return this.items.addAll(items);
//  }
//
//  public boolean removeAll(Collection<Product> items) {
//    return this.items.removeAll(items);
//  }
//}

// second version with wildcard
//public class ProductRepository {
//  private Collection<Product> items = new ArrayList<>();
//
//  public Collection<Product> getAll() {
//    return items;
//  }
//
//  public Product getById(int id) {
//    for (Product item : items) {
//      if (item.getId() == id) {
//        return item;
//      }
//    }
//    return null;
//  }
//
//  public boolean add(Product item) {
//    return items.add(item);
//  }
//
//  public boolean remove(Product item) {
//    return items.remove(item);
//  }
//
//  public boolean addAll(Collection<? extends Product> items) {
//    return this.items.addAll(items);
//  }
//
//  public boolean removeAll(Collection<? extends Product> items) {
//    return this.items.removeAll(items);
//  }
//}

// third version with List
public class ProductRepository {
  private List<Product> items = new ArrayList<>();

  public List<Product> getAll() {
    return items;
  }

  public Product getById(int id) {
    for (Product item : items) {
      if (item.getId() == id) {
        return item;
      }
    }
    return null;
  }

  public boolean add(Product item) {
    //
    return items.add(item);
    //
  }

  public boolean remove(Product item) {
    //
    return items.remove(item);
    //
  }

  public boolean addAll(Collection<? extends Product> items) {
    return this.items.addAll(items);
  }

  public boolean removeAll(Collection<? extends Product> items) {
    return this.items.removeAll(items);
  }
}

