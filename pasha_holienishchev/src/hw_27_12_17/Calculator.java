package hw_27_12_17;

import java.util.Scanner;

/**
 * Created by java on 09.01.2018.
 */
public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("Type first number");
        float num1 = getFloat();
        System.out.println("Type second number");
        float num2 = getFloat();
        System.out.println("Choose an operation (+ - / * %):");
        char operation = getOperation();
        float result = calc(num1, num2, operation);
        if(result%1 == 0)
        {
            int resultInt = (int)result;
            System.out.println("Integer result " + resultInt);
        }
        else
        {
            System.out.println("Result: " + result);
        }
    }

    private static float getFloat()
    {
        Scanner scanner = new Scanner(System.in);
        chekExit(scanner);
        float num = scanner.nextFloat();
        return num;
    }

    private static char getOperation()
    {
        Scanner sc = new Scanner(System.in);
        chekExit(sc);
        char operation = sc.next().charAt(0);
        return operation;
    }

    private static float calc(float num1, float num2, char operation)
    {
        float result = 0F;
        if (operation == '%')
        {
            num2 = num1*num2/100;
        }
        switch(operation)
        {
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Choose correct operation!");
                return 0;
        }
        return result;
    }

    private static void chekExit(Scanner scanner)
    {
        if('q' == scanner.next().charAt(0))
        {
            System.out.println("Exiting...");
            System.exit(0);
        }
    }
}
