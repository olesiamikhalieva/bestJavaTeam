package hw_20_02_18;

public class Recursiya {
    public static void main(String[] args) {
        outAroundScore(10);
    }

    public static int outAroundScore(int number){
        if (number == 0){
            System.out.println(0);
            return 0;
        }
        System.out.println(number);
        return outAroundScore(--number);
    }
}
