package les_02_03_18;

/**
 * Created by java on 02.03.2018.
 */
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {

        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
