public class Factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fib = n * fact(n - 1);
        return fib;
    }

    public static void main(String args[]) {
        System.out.println(fact(5));
    }
}
