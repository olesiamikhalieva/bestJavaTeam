package les_06_03_18;

import hw_06_02_18.ClassesBird.Eagle;

import java.util.*;

/**
 * Created by java on 06.03.2018.
 */
public class MainZavod {
    public static void main(String[] args) {

        Employer employer = new Employer("Ivan", 23);
        Employer employer2 = new Employer("Locky", 24);
        Employer employer3 = new Employer("Lock", 25);

        HashSet<Employer> employers = new HashSet<>();

        employers.add(employer);
        employers.add(employer2);
        employers.add(employer3);

        HashMap<String, Employer> stringStringHashMap = new HashMap<>();

        stringStringHashMap.put("001", employer);
        stringStringHashMap.put("002", employer2);
        stringStringHashMap.put("003", employer3);

        Employer emm = stringStringHashMap.get("001");

        System.out.println(emm.getYear());

        for (Map.Entry<String, Employer> entry : stringStringHashMap.entrySet()) {

            String key = entry.getKey();
            Employer em = entry.getValue();
            System.out.println(key + ", year - " + em.getYear());

        }
//        HashSet<Employer> stringHashSet = new HashSet<>();
//        stringHashSet.add(new Employer("Ivan", 25));
//        stringHashSet.add(new Employer("Doli",14));
//        stringHashSet.add(new Employer("Fun",24));
//        stringHashSet.add(new Employer("Sos",54));
//
//        stringHashSet.forEach(employer -> System.out.println(employer.getName()+ " its name"));
//
//

//        Set<String> employerSet = new TreeSet<>();
//
//        employerSet.add("d");
//        employerSet.add("f");
//        employerSet.add("g");
//        employerSet.add("h");
//        employerSet.add("a");
////        employerSet.add(new Employer("Ivan", 25));
////        employerSet.add(new Employer("Doli",14));
////        employerSet.add(new Employer("Fun",24));
////        employerSet.add(new Employer("Sos",54));
//
//        for (String s: employerSet) {
//            System.out.println(s);
//        }
//
//        Set<Integer> integerSet = new LinkedHashSet<>();
//
//        integerSet.add(1);
//        integerSet.add(17);
//        integerSet.add(20);
//        integerSet.add(3);
//        integerSet.add(55);
//
//        integerSet.forEach(a-> System.out.println(a));
    }
}
