public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        if (n == 0) {
            System.out.println("1");
        } else {
            while (n > 0) {
                fact = fact * n;
                n--;

            }
            System.out.println(fact);
        }
    }
}
