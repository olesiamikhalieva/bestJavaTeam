package les_20_02_18;

public class Factorial {
    public static int factorial(int n){

        int result;

        if (n == 1){
            System.out.println( " return n = 1");
            return 1;
        }

        System.out.println("get factorial method , n = " + n);
        result = factorial(n-1) * n;
        return result;

    }
}
