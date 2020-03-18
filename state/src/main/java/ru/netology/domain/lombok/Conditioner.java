package ru.netology.domain.lombok;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Conditioner {
  private int id;
  private String name = "noname";
  private int maxTemperature = 30;
  private int minTemperature = 15;
  private int currentTemperature = 22;
  private boolean on;
}
