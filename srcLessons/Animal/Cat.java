package Animal;

/**
 * Created by java on 30.01.2018.
 */
public class Cat extends Animals {

    private String name;
    private String age;
    private String cost;

    public Cat(String headForm, String name) {
        this.name = name;
        super.setHeadForm(headForm);
    }

    @Override
    protected void sayMyNameAndWhatICan() {
        super.sayMyNameAndWhatICan();
        System.out.println(murluk() + " so I Cat and my name " + getName());
    }

    private String murluk() {
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

        Cat cat = (Cat) o;

        return !(name != null ? !name.equals(cat.name) : cat.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
