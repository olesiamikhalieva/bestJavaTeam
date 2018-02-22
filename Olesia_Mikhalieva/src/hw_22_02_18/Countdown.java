package hw_22_02_18;

public class Countdown {
    public static void main(String[] args) {
        countdown(15);

    }
    private static int countdown(int n){
        if (n==0){
            System.exit(0);
        }
        System.out.print(n+" ");
            n = countdown(n-1);
            return n;
    }
}
