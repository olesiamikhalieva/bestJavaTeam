package hw_16_03_18.task2;

public class Test<T> {

    private T[]mass;

    public Test() {
    }

    public T getE(int x){
        return mass[x];
    }

    public T[] getMass() {
        return mass;
    }

    public void setMass(T[] mass) {
        this.mass = mass;
    }
}
