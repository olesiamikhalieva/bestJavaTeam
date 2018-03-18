package hw_16_03_18.Massiv;


public class Runner {
    public static void main(String[] args) {
        Integer [] mass = {1,67};
        Massiv massiv = new Massiv();
        massiv.setMass(mass);
        System.out.println(massiv.getElement(1));
    }
}
