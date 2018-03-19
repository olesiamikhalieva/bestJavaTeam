package hw_14_03_18.Task6.SupArrayList;

public interface Simple<E> extends Iterable<E>{
    boolean add(E e);
    E remove(int index);
    E get(int index);
    int size();
    void update(int index, E e);
    boolean contains(E e);
}
