package ru.netology.statistic;

public class StatisticsService {
  public long calculateSum(long[] purchases) {
    long sum = 0;
    for (long purchase : purchases) {
      // аналог sum = sum + purchase;
      sum += purchase;
    }
    return sum;
  }

  public long findMax(long[] purchases) {
    long currentMax = purchases[0];
    for (long purchase : purchases) {
      if (currentMax < purchase) {
        currentMax = purchase;
      }
    }
    return currentMax;
  }
}
