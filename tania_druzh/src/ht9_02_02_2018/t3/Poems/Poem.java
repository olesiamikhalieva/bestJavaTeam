package ht9_02_02_2018.t3.Poems;

import java.util.Objects;

public class Poem {
    private final String autor;
    private final String text;

    public Poem(String autor, String text) {
        this.autor = autor;
        this.text = text;
    }

    public String getAutor() {
        return autor;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Poem)) return false;
        Poem poem = (Poem) o;
        return Objects.equals(getAutor(), poem.getAutor()) &&
                Objects.equals(getText(), poem.getText());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAutor(), getText());
    }

    @Override
    public String toString() {
        return "Poem{" +
                "autor='" + autor + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
