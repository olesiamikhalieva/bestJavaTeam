package ht8_26_01_18.t12_1;

public class ComplexDouble extends Complex {
    private double realD;
    private double imageD;

    public ComplexDouble() {
    }

    public ComplexDouble(double real, double image) {
        this.realD = real;
        this.imageD = image;
    }

    @Override
    public int getReal() {
        return 0;
    }

    @Override
    public void setReal(int real) {

    }

    @Override
    public int getImage() {
        return 0;
    }

    @Override
    public void setImage(int image) {

    }

    @Override
    public double getRealD() {
        return realD;
    }

    @Override
    public void setRealD(double realD) {
        this.realD = realD;
    }

    @Override
    public double getImageD() {
        return imageD;
    }

    @Override
    public void setImageD(double imageD) {
        this.imageD = imageD;
    }

    @Override
    public String toString() {
        return "Complex{" +
                 realD +
                (imageD > 0 ? " + " : "") + imageD +
                "i}";
    }

    @Override
    public void addition(Complex complexDouble){
        this.realD = realD + complexDouble.getRealD();
        this.imageD = imageD + complexDouble.getImageD();
    }

    @Override
    public void subtraction(Complex complexDouble){
        this.realD = realD - complexDouble.getRealD();
        this.imageD = imageD - complexDouble.getImageD();
    }

    @Override
    public void multiplication(Complex complexDouble){
        this.realD = realD * complexDouble.getRealD() - imageD*complexDouble.getImageD();
        this.imageD = realD * complexDouble.getImageD() - imageD * complexDouble.getRealD();
    }

    @Override
    public void division(Complex complexDouble){
        this.realD = (realD * complexDouble.getRealD() + imageD * complexDouble.getImageD())
                / (complexDouble.getRealD()*complexDouble.getRealD() + complexDouble.getImageD()*complexDouble.getImageD());
        this.imageD = (imageD * complexDouble.getRealD() + realD * complexDouble.getImageD())
                / (complexDouble.getRealD()*complexDouble.getRealD() + complexDouble.getImageD()*complexDouble.getImageD());;
    }
}
