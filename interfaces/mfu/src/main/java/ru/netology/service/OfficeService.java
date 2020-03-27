package ru.netology.service;

import ru.netology.domain.Document;
import ru.netology.Printer;

public class OfficeService {
  public void print(Document document, Printer printer) {
    printer.print(document);
  }
}




