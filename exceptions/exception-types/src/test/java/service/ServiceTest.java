package service;

import exception.CheckedException;
import exception.UncheckedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {
  private Service service = new Service();

  @Test
  public void shouldThrowCheckedException() {
    assertThrows(CheckedException.class, () -> service.throwChecked());
  }

  @Test
  public void shouldThrowUncheckedException() {
    assertThrows(UncheckedException.class, () -> service.throwUnchecked());
  }
}


