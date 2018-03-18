package ht17_13_03_18.MySuperClasses;


public class MySuperArrayList <T> {
    private T[] array;
    private int size;

    public MySuperArrayList() {
        array = (T[]) new Object[1];
        size = 0;
    }

    public void add(T item){
        T[] newArray = (T[]) new Object[size + 1];
        int it = 0;
        for (T t : array) {
            if (t != null) {
                newArray[it] = t;
                it++;
            }
        }
        newArray[size] = item;
        size = size + 1;
        array = newArray;
    }

    public T get(int number){
        if (number > size)
            return array[size];
        else if (number < 0)
            return array[0];
        return array[number];
    }

    public void remove(int item){
        if (item <= size || item > 0){
            T[] newArray = (T[]) new Object[size -1];
            int it = 0;
            for (int i = 0; i < array.length; i ++) {
                if (i != item) {
                    newArray[it] = array[i];
                    it++;
                }
            }
            size = size - 1;
            array = newArray;
        }
    }

    public int size(){
        return size;
    }

    public boolean contains(T item){
        for (T t : array) {
            if (t.equals(item))
                return true;
        }
        return false;
    }



    @Override
    public String toString() {
        String s = "";
        for (T t : array) {
            s = s + t + " ";
        }
        return s;
    }
}
