package ru.netology;

import org.junit.jupiter.api.Test;

public class DemoTest {
  @Test
  public void shouldBeCalled() {
    System.out.println("Test method called");
  }

  public void shouldNotBeCalled() {
    System.out.println("Invalid method called");
  }
}
