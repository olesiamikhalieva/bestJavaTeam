//8. Создать строку с произвольным словом или набором букв. Преобразовать в массив. Вывести массив каждую букву(символ).

import java.util.Scanner;

public class stringToArray {
    public static void main(String[] args)
    {
        System.out.println("Введите Строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        str.getChars(0,str.length(),arr,0);
        System.out.println("Массив имеет вид: ");
        for (int i = 0; i < str.length(); i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
