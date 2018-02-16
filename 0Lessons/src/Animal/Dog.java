package Animal;

/**
 * Created by java on 30.01.2018.
 */
public class Dog extends Animals{
    private String name;

    public Dog(String headForm, String name) {
        this.name = name;
        super.setHeadForm(headForm);
    }

    @Override
    protected void sayMyNameAndWhatICan() {
        super.sayMyNameAndWhatICan();
        System.out.println(Gav() + " so I Cat and my name " + getName());
    }

    private String Gav() {
        return "mur";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return !(name != null ? !name.equals(dog.name) : dog.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
