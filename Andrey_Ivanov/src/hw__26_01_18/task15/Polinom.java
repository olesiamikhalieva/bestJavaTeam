package hw__26_01_18.task15;

public class Polinom extends Array {


    public Polinom(int c0, int c1, int c2, String x1, String x2) {
        super(c0, c1, c2, x1, x2);
    }

    public String polinom() {
        return massConst[0] + "+" + massConst[1] + massVar[0] + "+" + massConst[2] + massVar[1];
    }
}