package ht17_13_03_18.Birds;

import java.util.Objects;

public abstract class Bird implements Comparable<Bird> {
    private String name;

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
        Bird bird = (Bird) o;
        return Objects.equals(name, bird.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public int compareTo(Bird o) {
        return name.compareTo(o.getName());
    }
}
