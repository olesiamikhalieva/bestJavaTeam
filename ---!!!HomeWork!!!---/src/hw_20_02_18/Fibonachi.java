package hw_20_02_18;

public class Fibonachi {
    public static void main(String[] args) {

        System.out.println(fibonachi(10));

    }

    public static int fibonachi(int number) {
        if (number == 0){
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        if (number == 2) {
            return 1;
        }
        return fibonachi(number - 1) + fibonachi(number - 2);
    }
}
