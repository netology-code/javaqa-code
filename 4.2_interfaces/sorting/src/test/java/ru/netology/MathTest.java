package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
  @Test
  public void shouldCalculateSin() {
    double result = Math.sin(Math.PI / 2);
    double expected = 1.0;
    double delta = 0.01;
    Assertions.assertEquals(expected, result, delta);
  }
}


