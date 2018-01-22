//3. Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
import java.util.Scanner;
public class NearestTo10 {

    public static void main(String[] args)
    {
        for(;;)
        {
            System.out.print("Введите первое число(10 для выхода): ");
            Scanner num = new Scanner(System.in);
            double m = num.nextDouble();
            if ( m == 10) break;
            System.out.print("Введите второе число(10 для выхода): ");
            Scanner mun = new Scanner(System.in);
            double n = mun.nextDouble();
            if (n == 10) break;
            if (Math.abs(n - 10) > Math.abs(m - 10)) {
                System.out.println("Ближайшее число к десяти: " + m);
            }
            if (Math.abs(n - 10) < Math.abs(m - 10)) {
                System.out.println("Ближайшее число к десяти: " + n);
            }
        }
    }
}