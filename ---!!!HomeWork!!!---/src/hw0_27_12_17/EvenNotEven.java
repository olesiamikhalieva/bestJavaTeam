package hw0_27_12_17;//2. Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.
import java.util.Scanner;

public class EvenNotEven
{
    public static void main(String[] args)
    {
        for(;;)
        {
            System.out.print("Введите число(для выхода введите 0): ");
            Scanner n = new Scanner(System.in);
            int num = n.nextInt();
            int ost = num%2;
            if(num == 0) break;
            if (ost == 0)
                System.out.println("Ваше число четное");
            else
                System.out.println("Ваше число НЕ четное");
        }
    }
}