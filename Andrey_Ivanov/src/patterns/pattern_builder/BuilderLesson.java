package patterns.pattern_builder;

public class BuilderLesson {
    public static void main(String[] args) {

        SportCar sportcar = new Builder("Honda").setColor("Grey").setMaxSpeed(500).build();
        System.out.println(sportcar.getName() + "-" + sportcar.getColor() + "-" + sportcar.getMaxSpeed());

    }
}

