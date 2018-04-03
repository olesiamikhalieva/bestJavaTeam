package les3_20_02_18;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by java on 20.02.2018.
 */
public class Test {

    public static void main(String[] args) {
        String[] planets = new String[] {"d" , "a" , "c", "b", "e"};
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println( " --------------------------------- " );

        Arrays.sort(planets,(first,second) -> first.length() - second.length());

        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
