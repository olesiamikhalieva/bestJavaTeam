package hw_26_01_18.complexNumbers;

public class ComplexNumbers {
    private static double a = 5, b= -1, c=9, d=91.5;
    public static void main(String[] args) {
        System.out.println("a= "+a+"; b= "+b+"; c="+c+ "; d="+d);
        sum();
        System.out.println();
        subtraction();
        System.out.println();
        multiplication();
    }

    private static void sum(){
        System.out.println("a+bi  +  c+di");
        System.out.println((a+c)+(b+d)+"i");
    }

    private static void subtraction(){
        System.out.println("a+bi  -  c+di");
        System.out.println((a-c)+(b-d)+"i");
    }

    private static void multiplication(){
        System.out.println("a+bi  *  c+di");
        System.out.println((a*c-b*d)+(a*b+b*c)+"i");
    }

}
