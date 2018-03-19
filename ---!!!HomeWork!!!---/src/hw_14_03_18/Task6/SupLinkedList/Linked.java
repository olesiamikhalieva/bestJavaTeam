package hw_14_03_18.Task6.SupLinkedList;

public interface Linked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElemByIndex(int counter);
    E remove(int index);
    boolean contains(E value);
}
