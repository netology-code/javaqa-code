public class MainV6 {
    public static void main(String[] args) {
        boolean registered = true;
        int percent = registered ? 3 : 1;
        long amount = 100060;
        long bonus = amount * percent / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        System.out.println(bonus);
    }
}


