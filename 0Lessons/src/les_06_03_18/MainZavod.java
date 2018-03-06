package les_06_03_18;

import hw_06_02_18.ClassesBird.Eagle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by java on 06.03.2018.
 */
public class MainZavod {
    public static void main(String[] args) {
        List<Employer> employerList = new LinkedList<>();
        LinkedList<Employer> employerList2 = new LinkedList<>();
        Employer emp = new Worker("Eric",6);

        employerList.add(new Manager("Vasia", 9));
        employerList.add(new Manager("Petya", 8));
        employerList.add(new Manager("Kaka", 3));
        employerList.add(new Worker("Inocentiy", 5));
        employerList.add(new Worker("Katya", 7));
        employerList.add(new Worker("Dima", 2));
//        emp.setName("Edic");
//        employerList.add(emp);

        Iterator<Employer> iterator = employerList.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().getName());
//            iterator.remove();
//            System.out.println(employerList.size());
//        }
//
        for (Employer employer : employerList) {
            System.out.println(employer.getName());
            employerList.remove(employer);
        }

    }
}
