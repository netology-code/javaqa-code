package ru.netology;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Launcher {
  // что такое исключения мы разберём на следующей лекции
  public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
    // создаём объект типа `Class` (generic'и мы пока не знаем, поэтому и так "сойдёт")
    Class clazz = DemoTest.class;
    // берём все методы класса
    Method[] methods = clazz.getDeclaredMethods();
    // перебираем методы
    for (Method method : methods) {
      // смотрим, есть ли над методом аннотация @Test
      if (method.isAnnotationPresent(Test.class)) {
        // создаём объект класса (newInstance помечен аннотацией @Deprecated, но для простоты мы будем использовать его, в противном случае, нужно выбирать конструкторы)
        Object object = clazz.newInstance();
        // вызываем метод на объекте
        method.invoke(object);
      }
    }
  }
}
