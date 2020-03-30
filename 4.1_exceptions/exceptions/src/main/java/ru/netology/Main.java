package ru.netology;

import ru.netology.domain.PurchaseItem;
import ru.netology.manager.CartManager;
import ru.netology.repository.CartRepository;

public class Main {
  public static void main(String[] args) {
    CartManager manager = new CartManager(new CartRepository());
    manager.add(new PurchaseItem(
        1,
        1,
        "Java Core",
        1000,
        1
    ));

//    manager.removeById(2);
//    System.out.println("main done"); // for demo only

//    try {
//      System.out.println("before remove");
//      manager.removeById(2);
//      System.out.println("after remove");
//    } catch (ArrayIndexOutOfBoundsException e) {
//      e.printStackTrace();
//      System.out.println("specific catch");
//    } catch (RuntimeException e) {
//      System.out.println("runtime catch");
//    } catch (Exception e) {
//      System.out.println("catch");
//    } finally {
//      System.out.println("finally");
//    }

    try {
      System.out.println("before remove");
      manager.removeById(2);
      System.out.println("after remove");
    } catch (Throwable e) {

    }




    System.out.println("main done"); // for demo only
  }
}

