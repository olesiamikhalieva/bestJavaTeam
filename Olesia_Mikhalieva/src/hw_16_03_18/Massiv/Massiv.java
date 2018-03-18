package hw_16_03_18.Massiv;


public class Massiv<T> {
 T [] mass;
  T element;

    public T[] getMass() {
        return mass;
    }

    public void setMass(T[] mass) {
        this.mass = mass;
    }

    public T getElement(int i) {
        return mass[i];
    }

    public void setElement(T element) {
        this.element = element;
    }
}
