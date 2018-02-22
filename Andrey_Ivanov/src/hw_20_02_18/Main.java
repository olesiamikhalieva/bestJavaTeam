package hw_20_02_18;

public class Main {

    static int fibonacci(int n) {       // метод для последовательности Фибоначчи
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void countdown(int num) {       // метод для обратного отсчета через рекурсию
        if (num < 0) return;
        System.out.print(num-- + " ");
        countdown(num);
       }


    public static void main(String[] args) {

        System.out.println("Последовательность Фибоначчи через рекурсию:");

        for (int i = 1; i < 19; i++) {// Вывод последовательности Фибоначчи через рекурсию
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\n");

        System.out.println("Обратный отсчет через рекурсию:");
        countdown(19);          //  Вызов метода для обратного отсчета через рекурсию
    }
}
