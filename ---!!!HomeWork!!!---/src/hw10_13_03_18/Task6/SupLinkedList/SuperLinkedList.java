package hw10_13_03_18.Task6.SupLinkedList;

import java.util.Iterator;
import java.util.Objects;

public class SuperLinkedList<E> implements Linked<E>, Iterable<E>, DescendingIterator<E> {

    public static void main(String[] args) {
        SuperLinkedList<String> stringLinked = new SuperLinkedList<>();
        stringLinked.addLast("abc");
        stringLinked.addLast("ваваabc");
        System.out.println("размер --  " + stringLinked.size());
        System.out.println("берем 0 эллемент --  " + stringLinked.getElemByIndex(0));
        stringLinked.addFirst("gvdfg");
        System.out.println("снова 0 эллемент, после добавления вначало -- " + stringLinked.getElemByIndex(0));

        stringLinked.addLast("abc1");
        stringLinked.addLast("abc2");
        stringLinked.addLast("abc3");
        stringLinked.addLast("abc4");

        System.out.println("Весь связный список -- ");
        for (String s : stringLinked) {
            System.out.print('\'' + s + '\''+ " ");
        }

        System.out.println("\nв обратном порядке -- ");
        Iterator iterator = stringLinked.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print("\'" + iterator.next() + "\'" +  " ");
        }

        System.out.println("\nудаляем и получаем эллемент -- " + stringLinked.remove(3));
        System.out.println("Весь связный список -- ");
        for (String s : stringLinked) {
            System.out.print('\'' +  s + '\'' + " ");
        }

        System.out.println("\nЕсть ли эллемент abc1 в коллекции? -- " + stringLinked.contains("abc1"));
        System.out.println("Есть ли эллемент abc2 в коллекции? -- " +stringLinked.contains("abc2"));
    }

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public SuperLinkedList() {
        this.lastNode = new Node<E>(null, this.firstNode, null);
        this.firstNode = new Node<E>(null, null, this.lastNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = this.lastNode;
        prev.setCurrentElement(e);
        this.lastNode = new Node<E>(null, prev, null);
        prev.setNextElem(this.lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = this.firstNode;
        next.setCurrentElement(e);
        this.firstNode = new Node<E>(null, null, next);
        next.setPrevElem(firstNode);
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E getElemByIndex(int counter) {
        Node<E> target = this.firstNode.getNextElem();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    @Override
    public E remove(int index) {
        Node<E> target =  this.firstNode.getNextElem();
        for (int i = 0; i < index; i++){
            target = getNextElement(target);
        }

        Node<E> prevElem = target.getPrevElem();
        Node<E> nextElem = target.getNextElem();

        prevElem.setNextElem(nextElem);
        nextElem.setPrevElem(prevElem);
        size--;
        return target.getCurrentElement();
    }

    @Override
    public boolean contains(E value) {
        Node<E> target = this.firstNode.getNextElem();
        for (int i = 0; i < size ; i++) {
            if (target.getCurrentElement().equals(value)){
                return true;
            }
            target = getNextElement(target);
        }
        return false;
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElem();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElemByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size - 1;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getElemByIndex(counter--);
            }
        };
    }

    public class Node<E> {
        private E currentElement;
        private Node<E> nextElem;
        private Node<E> prevElem;

        private Node(E currentElement, Node<E> prevElem, Node<E> nextElem) {
            this.currentElement = currentElement;
            this.prevElem = prevElem;
            this.nextElem = nextElem;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElem() {
            return nextElem;
        }

        public void setNextElem(Node<E> nextElem) {
            this.nextElem = nextElem;
        }

        public Node<E> getPrevElem() {
            return prevElem;
        }

        public void setPrevElem(Node<E> prevElem) {
            this.prevElem = prevElem;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(currentElement, node.currentElement) &&
                    Objects.equals(nextElem, node.nextElem) &&
                    Objects.equals(prevElem, node.prevElem);
        }

        @Override
        public int hashCode() {

            return Objects.hash(currentElement, nextElem, prevElem);
        }
    }
}
