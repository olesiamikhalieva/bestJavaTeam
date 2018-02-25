package Les_26_01_18;

/**
 * Created by java on 26.01.2018.
 */
public class Transformer extends Robot {

    private String name;
    private boolean sword;
    protected String transformerField;


    public void fight() {
        if (sword == true)
            System.out.println(getName() + "i can fight, my serial number is " + getSerialNumber());
    }

    public boolean isSword() {
        return sword;
    }

    public void setSword(boolean sword) {
        this.sword = sword;
    }


    public String getName() {
        System.out.println("it is trsnsformer get name");
        return name;
    }


    public void setName(String name) {
        System.out.println("it is trsnsformer set name");
        this.name = name;
    }

    @Override
    public void thinking() {
        System.out.println("But i am transformer am very smart");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transformer that = (Transformer) o;

        if (sword != that.sword) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return !(transformerField != null ? !transformerField.equals(that.transformerField) : that.transformerField != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sword ? 1 : 0);
        result = 31 * result + (transformerField != null ? transformerField.hashCode() : 0);
        return result;
    }
}
