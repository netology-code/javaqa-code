package ru.netology.domain.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
  @Test
  public void shouldInitFields() {
    Conditioner conditioner = new Conditioner();

    assertEquals("noname", conditioner.getName());
    assertEquals(30, conditioner.getMaxTemperature());
    assertEquals(15, conditioner.getMinTemperature());
    assertEquals(22, conditioner.getCurrentTemperature());
  }
}