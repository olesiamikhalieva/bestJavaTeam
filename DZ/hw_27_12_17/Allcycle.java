//4.Вывести на экран числа от -10 до 25 с помощью всех известных циклов.
public class Allcycle {
    public static void main(String[] args)
    {
        for (int i = -10; i<=25; i++)
        {
            System.out.print(i+" ");
        }

        System.out.println("");

        int i = -10;
        while (i<=25)
        {
            System.out.print(i+" ");
            i++;
        }

        System.out.println("");

        int f = -10;
        do
        {
            System.out.print(f+" ");
            f++;
        }while (f<=25);
    }
}

