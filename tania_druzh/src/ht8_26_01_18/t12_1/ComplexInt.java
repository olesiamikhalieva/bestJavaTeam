package ht8_26_01_18.t12_1;

public class ComplexInt extends Complex {
    private int real;
    private int image;

    public ComplexInt() {
    }

    public ComplexInt(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public int getReal() {
        return real;
    }

    @Override
    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public int getImage() {
        return image;
    }

    @Override
    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public double getRealD() {
        return 0;
    }

    @Override
    public void setRealD(double realD) {

    }

    @Override
    public double getImageD() {
        return 0;
    }

    @Override
    public void setImageD(double imageD) {

    }

    @Override
    public String toString() {
        return "Complex{" +
                 real +
                (image > 0 ? " + " : "") + image +
                "i}";
    }

    @Override
    public void addition(Complex complexInt){
        this.real = real + complexInt.getReal();
        this.image = image + complexInt.getImage();
    }

    @Override
    public void subtraction(Complex complexInt){
        this.real = real - complexInt.getReal();
        this.image = image - complexInt.getImage();
    }

    @Override
    public void multiplication(Complex complexInt){
        this.real = real * complexInt.getReal() - image*complexInt.getImage();
        this.image = real * complexInt.getImage() - image * complexInt.getReal();
    }

    @Override
    public void division(Complex complexInt){
        this.real = (real * complexInt.getReal() + image * complexInt.getImage())
                / (complexInt.getReal()*complexInt.getReal() + complexInt.getImage()*complexInt.getImage());
        this.image = (image * complexInt.getReal() + real * complexInt.getImage())
                / (complexInt.getReal()*complexInt.getReal() + complexInt.getImage()*complexInt.getImage());;
    }
}
