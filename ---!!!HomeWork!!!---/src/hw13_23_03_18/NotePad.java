package hw13_23_03_18;

import java.util.ArrayList;
import java.util.Objects;

public class NotePad implements Methods {
    private ArrayList<Entry> entries = new ArrayList<>();

    public ArrayList<Entry> getEntries() {
        return entries;
    }
    @Override
    public void addEntry(Entry entry) {
        this.entries.add(entry);
    }

    @Override
    public Entry deleteEntry(int number) {
        return this.entries.remove(number);
    }

    @Override
    public Entry editEntry(int number) {
        return this.entries.get(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotePad notePad = (NotePad) o;
        return Objects.equals(entries, notePad.entries);
    }

    @Override
    public int hashCode() {

        return Objects.hash(entries);
    }

    @Override
    public String toString() {
        return entries.toString();
    }
}
