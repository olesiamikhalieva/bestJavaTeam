package ExamplesFromBook.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList {
    public static void main(String[] args) {
//        List<String> staff = new java.util.LinkedList<>();
//        staff.add("Amy");
//        staff.add("Bob");
//        staff.add("Carl");
//        Iterator iter = staff.iterator();
//        String first = (String) iter.next();
//        String second = (String) iter.next();
//        iter.remove();
        List<String> a = new java.util.LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new java.util.LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> alter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (alter.hasNext()) {
                alter.next();
                alter.add(bIter.next());
                alter.add(bIter.next());
            }

            System.out.println(a);

            bIter = b.iterator();
            while (bIter.hasNext()) {
                if (bIter.hasNext()) {
                    bIter.next();
                    bIter.remove();
                }
            }
            System.out.println(b);

            a.removeAll(b);
            System.out.println(b);
            System.out.println(a);
        }

    }
}
