public class MainV4 {
  public static void main(String[] args) {
    boolean registered = true;
    int percent;
    if (registered) {
      percent = 3;
    } else {
      percent = 1;
    }
    long amount = 100060;
    long bonus = amount * percent / 100 / 100;
    System.out.println(bonus);
  }
}



