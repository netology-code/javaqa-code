import exception.CheckedException;
import service.Service;

public class Main {
  public static void main(String[] args) {
    Service service = new Service();

    try {
      service.throwChecked();
    } catch (CheckedException e) {
      e.printStackTrace();
    }

    service.throwUnchecked();
  }
}

