package pattern_builder;

public class BuilderLesson {

    public static void main(String[] args) {

        SportCar sportcar = new Builder("Honda").setColor("Grey").setMaxSpeed(500).build();
        System.out.println(sportcar.getName() + "-" + sportcar.getColor() + "-" + sportcar.getMaxSpeed());

        SlowCar slowCar = new Builder("Lada").setColor("yellow").setWeight(900).setMaxSpeed(70).build1();
        System.out.println(slowCar.getName());
        System.out.println(slowCar.getColor());
        System.out.println(slowCar.getMaxSpeed());
        System.out.println(slowCar.getWeight());

    }
}





