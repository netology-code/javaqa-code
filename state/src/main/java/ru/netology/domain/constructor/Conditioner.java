package ru.netology.domain.constructor;

public class Conditioner {
  private int id;
  private String name = "noname";
  private int maxTemperature = 30;
  private int minTemperature = 15;
  private int currentTemperature = 22;
  private boolean on;

  public Conditioner() {
  }

  public Conditioner(
      int id,
      String name,
      int maxTemperature,
      int minTemperature,
      int currentTemperature,
      boolean on
  ) {
    this.id = id;
    this.name = name;
    this.maxTemperature = maxTemperature;
    this.minTemperature = minTemperature;
    this.currentTemperature = currentTemperature;
    this.on = on;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMaxTemperature() {
    return maxTemperature;
  }

  public void setMaxTemperature(int maxTemperature) {
    this.maxTemperature = maxTemperature;
  }

  public int getMinTemperature() {
    return minTemperature;
  }

  public void setMinTemperature(int minTemperature) {
    this.minTemperature = minTemperature;
  }

  public int getCurrentTemperature() {
    return currentTemperature;
  }

  public void setCurrentTemperature(int currentTemperature) {
    this.currentTemperature = currentTemperature;
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean on) {
    this.on = on;
  }
}
