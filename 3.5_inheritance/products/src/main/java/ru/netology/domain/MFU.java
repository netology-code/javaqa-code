package ru.netology.domain;

class Printer {
  public void print() {
  }
}

class Scanner {
  public void scan() {
  }
}

//class MFU extends Printer, Scanner {
//}

class MFU {
  private Printer printer;
  private Scanner scanner;

  public void print() {
    printer.print();
  }

  public void scan() {
    scanner.scan();
  }
}

















