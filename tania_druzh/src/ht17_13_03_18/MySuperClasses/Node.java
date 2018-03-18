package ht17_13_03_18.MySuperClasses;

public class Node<T> {
    private T currentObject;
    private T priviousObject;
    private T nextObject;

    public Node() {

    }

    public Node(T currentObject, T priviousObject, T nextObject) {
        this.currentObject = currentObject;
        this.priviousObject = priviousObject;
        this.nextObject = nextObject;
    }

    public T getCurrentObject() {
        return currentObject;
    }

    public void setCurrentObject(T currentObject) {
        this.currentObject = currentObject;
    }

    public T getPriviousObject() {
        return priviousObject;
    }

    public void setPriviousObject(T priviousObject) {
        this.priviousObject = priviousObject;
    }

    public T getNextObject() {
        return nextObject;
    }

    public void setNextObject(T nextObject) {
        this.nextObject = nextObject;
    }


}
