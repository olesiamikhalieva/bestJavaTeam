//Увеличить число на 10%
package hw_09_01_18;

import java.util.Scanner;

public class MoreLessVariable {
    public static void main(String[] args) {
        moreLess();
    }

    public static void moreLess() {
        for(int i = 0;i<=10;i++) {
            System.out.print("Введите число: ");
            Scanner n = new Scanner(System.in);
            int num = n.nextInt();
            if (num > 5)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}


