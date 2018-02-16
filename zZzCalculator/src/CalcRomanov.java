//Калькулятор
import java.util.Scanner;

public class CalcRomanov {
    public static void main(String[] args) {

        for(int i = 0;i <= 10; i++)
        {

            System.out.println("Ваш результат:" + calc(getInt(), getInt2(), getOperation()));

        }

    }

    public static int getInt()
    {

        System.out.println("Введите первое число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;

    }
    public static int getInt2()
    {

        System.out.println("Введите второе число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;

    }

    public static char getOperation()
    {

        char ch = '0';
        System.out.println("Введите желаемую операцию(+,-,/,*)");
        Scanner in = new Scanner(System.in);
        String sym = in.nextLine();
        switch (sym)
        {
            case "+":
                ch = '+';
                break;
            case "-":
                ch = '-';
                break;
            case "/":
                ch = '/';
                break;
            case "*":
                ch = '*';
                break;
                default:
                    System.out.println("Вы ввели неправильный символ, повторите попытку!");
                    break;
        }

        return ch;

    }

    public static int calc(int num1, int num2, char g) {
        int results = 0;
        switch (g)
        {
            case '+':
                results = num1 + num2;
                break;
            case '-':
                results = num1 - num2;
                break;
            case '/':
                results = num1 / num2;
                break;
            case '*':
                results = num1 * num2;
                break;
                default:
                    System.out.println("sdsdb");
                    break;

        }

        return results;

    }
}
