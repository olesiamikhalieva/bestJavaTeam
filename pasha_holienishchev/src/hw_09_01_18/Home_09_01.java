package hw_09_01_18;

import java.util.Arrays;
import java.util.Scanner;

public class Home_09_01
{
    public static void main(String[] args)
    {
        int size = 10;
        paintTrian(size);
        increase10();
    }


    private static void increase10()
    {
        System.out.println("\nIncrease number in 10%:");
        System.out.println("Type number: ");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        number = number + number/10;
        System.out.println(number);
    }

    private static void paintTrian(int size)
    {

        int i = (size-1)/2; //определяем средний элемент массисва
        for (int k = i; i >= 0; --i, ++k)
        {
            int []mass = new int[size];
            for (int m = 0; m < size; ++m)
            {
                mass[m] = 0;
                if(i == 0)
                {
                    mass[m] = 1;
                    if(k != (size - 1))
                    {
                        mass[size - 1] = 0;
                    }
                }
            }
            mass[k] = 1;
            mass[i] = 1;
            System.out.println(Arrays.toString(mass));
        }
    }
}
