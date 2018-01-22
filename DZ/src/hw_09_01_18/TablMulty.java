public class TablMulty {
    public static void main(String[] args) {
        System.out.println("Обычная таблица умножения: ");
        tabl();
        System.out.println("-------------------------------------------------");
        System.out.println("Реверсная таблица умножения: ");
        tablRev();
    }
    public static void tabl ()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("умножение на " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.print(" " + j * i);
                if (j == 10)
                {
                    System.out.println(" ");
                }
            }
        }
    }

    public static void tablRev() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("умножение на " + i);
            for (int j = 10; j >= 1; j--)
            {
                System.out.print(" " + j * i);
                if (j == 1)
                {
                    System.out.println(" ");
                }
            }
        }
    }
}
