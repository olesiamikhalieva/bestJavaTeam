package ht13_20_02_18;

public class RecursRunner {
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        rec.countDown(15);
        Fib fib = new Fib();
        int n = 15;
        for (int i = 1; i <= n; i++) {
            System.out.print(fib.fib(i) + " ");
        }
    }
}
