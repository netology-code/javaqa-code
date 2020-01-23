package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
  @Test
  void calculateSum() {
    StatisticsService service = new StatisticsService();

    long[] purchases = {1_000, 2_000, 500, 5_000, 2_000};
    long expected = 10_500;

    long actual = service.calculateSum(purchases);

    assertEquals(expected, actual);
  }

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] purchases = {1_000, 2_000, 500, 5_000, 2_000};
    long expected = 5_000;

    long actual = service.findMax(purchases);

    assertEquals(expected, actual);
  }
}