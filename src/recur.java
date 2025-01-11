public class recur {
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Число должно быть неотрицательным.");
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int fibonacci(int n) {
        if (n <= 0) throw new IllegalArgumentException("Число должно быть положительным.");
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
