package service;

import exception.CheckedException;
import exception.UncheckedException;

public class Service {
  public void throwChecked() throws CheckedException {
    throw new CheckedException();
  }

  public void throwUnchecked() {
    throw new UncheckedException();
  }
}






