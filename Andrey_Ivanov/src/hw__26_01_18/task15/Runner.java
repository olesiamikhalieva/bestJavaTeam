package hw__26_01_18.task15;

public class Runner {
    public static void main(String[] args) {

        Polinom polinom = new Polinom(5, 8, 7, "yes", "no");

        System.out.println("c0+c1x1+c2x2=" + polinom.polinom());
    }

}
