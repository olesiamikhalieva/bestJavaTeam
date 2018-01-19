package hw_12_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class Student {

    private int age;
    private String name;

    public Student() {
        setAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge() {
        int randomNum = ThreadLocalRandom.current().nextInt(7, 16 + 1);
        this.age = randomNum;
    }

    public int getAge() {
        return age;
    }


}
