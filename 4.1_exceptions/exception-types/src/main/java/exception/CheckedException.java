package exception;

public class CheckedException extends Exception {
  public CheckedException() {
    super();
  }

  public CheckedException(String message) {
    super(message);
  }

  public CheckedException(String message, Throwable cause) {
    super(message, cause);
  }

  public CheckedException(Throwable cause) {
    super(cause);
  }

  protected CheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
