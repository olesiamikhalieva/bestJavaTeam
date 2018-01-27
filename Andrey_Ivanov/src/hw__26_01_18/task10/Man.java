package hw__26_01_18.task10;

public class Man {
    private String name;
    private int age;
    private String sex;
    private int weight;

    public Man() {
    }

    public Man(String sex) {
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void changesNameAgeWeight() {
        if (getSex() == "man") {
            setName("Andrey");
            setAge(22);
            setWeight(70);
        } else {
            setName("Natasha");
            setAge(21);
            setWeight(60);
        }
    }
}

