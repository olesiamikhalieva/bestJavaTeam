package hw_14_03_18.Task6;


import java.util.ArrayList;
import java.util.Iterator;

public class SuperArrayList<E> implements Simple<E> {

    public static void main(String[] args) {
        Simple<String> strings = new SuperArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");

        System.out.println(strings.get(1));
        System.out.println(strings.size());
        strings.update(1, "update");//заменим 2 элемент на "update"
        System.out.println(strings.get(1));

        strings.delete(1);//удаляем 2 эллемант
        System.out.println(strings.get(1));
        System.out.println(strings.size());
        System.out.println("распечатаем все что осталось в коллекции");
        for (String s : strings){
            System.out.println(s);
        }
        System.out.println(strings.contains("first"));//такой эллемент есть
        System.out.println(strings.contains("firstrtrtr"));// такого нету

    }

    private E[] values;

    public SuperArrayList() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = this.values;
            this.values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, this.values, 0, temp.length);
            this.values[this.values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try{
            E[] temp = this.values;
            this.values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, this.values, 0, index);
            int countElementAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, this.values, index, countElementAfterIndex);
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return this.values[index];
    }

    @Override
    public int size() {
        return this.values.length;
    }

    @Override
    public void update(int index, E e) {
        this.values[index] = e;
    }

    @Override
    public boolean contains(E e) {
        for (E el:this.values) {
            if (e.equals(el)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(this.values);
    }
}
