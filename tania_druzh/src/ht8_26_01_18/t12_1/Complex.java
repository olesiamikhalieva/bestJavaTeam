package ht8_26_01_18.t12_1;

/*Составить описание класса для представления комплексных чисел
с возможностью задания вещественной и мнимой частей как числами типов double, так и целыми числами.
Обеспечить выполнение операций сложения, вычитания и умножения комплексных чисел.*/

public abstract class Complex {
//    private int real;
//    private int image;
//    private double realD;
//    private double imageD;

    public abstract int getReal();

    public abstract void setReal(int real);

    public abstract int getImage();

    public abstract void setImage(int image);

    public abstract double getRealD();

    public abstract void setRealD(double realD);

    public abstract double getImageD();

    public abstract void setImageD(double imageD);

    public abstract void addition(Complex complexInt);
    public abstract void subtraction(Complex complexInt);
    public abstract void multiplication(Complex complexInt);
    public abstract void division(Complex complexInt);

//    public abstract void addition(ComplexDouble complexDouble);
//    public abstract void subtraction(ComplexDouble complexDouble);
//    public abstract void multiplication(ComplexDouble complexDouble);
//    public abstract void division(ComplexDouble complexDouble);





}
