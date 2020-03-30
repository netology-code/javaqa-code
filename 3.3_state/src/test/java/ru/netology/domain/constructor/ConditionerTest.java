package ru.netology.domain.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
  @Test
  public void shouldUseConstructor() {
    Conditioner conditioner = new Conditioner(
        1,
        "Winter Cold",
        30,
        10,
        29,
        true
    );
    assertEquals(29, conditioner.getCurrentTemperature());
  }

  @Test
  public void shouldUseNoArgsConstructor() {
    Conditioner conditioner = new Conditioner();
    assertEquals(22, conditioner.getCurrentTemperature());
  }
}

