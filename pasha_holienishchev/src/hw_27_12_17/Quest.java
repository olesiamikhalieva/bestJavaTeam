package hw_27_12_17;

import java.util.Scanner;

public class Quest
{
    public static void main(String[] args) {
        System.out.println("Вы на телевикторине ДжоваПрограмминг\nДайте 7 правильных ответов чтобы победить!");
        int[] rAns = {1, 1, 2, 2, 3, 2, 3, 2, 1};
        int counter = 0;
        for(int i = 0; i < 9; ++i)
        {
            getQuestion(i);
            int tAns = getAnswer();
            if(tAns == rAns[i])
            {
                System.out.println("Правильно!");
                ++counter;
            }
            else
            {
                System.out.println("Неправильно!");
                System.out.println("Парвильный ответ: " + rAns[i]);
            }
        }
        System.out.println("Вы ответили правильно " + counter + " раз");
        if(counter >= 7)
        {
            System.out.println("Вы победили!");
        }
        else
        {
            System.out.println("Ура! Вы проиграли!");
        }
    }

    private static int getAnswer()
    {
        System.out.println("Ваш ответ:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    private static int getQuestion(int number)
    {
        switch(number)
        {
            case 0:
                System.out.println("В каком из трех состояний вещества при одной и той же температуре диффузия происходит медленнее?: \n1. В твёрдом\n2. В жидком\n3. В газообразном");
                break;
            case 1:
                System.out.println("Назовите фамилию фельдшера из рассказа А.П. Чехова - Хирургия\n1. Курятин\n2. Квасцов\n3. Корягин");
                break;
            case 2:
                System.out.println("Какое островное государство самое маленькое в Южной Азии?\n1. Шри-Ланка\n2. Мальдивская Республика\n3. Бангладеш");
                break;
            case 3:
                System.out.println("В каком ряду все слова пишутся слитно?\n1.(в)троем, (с)разбегу\n2.(до)черна, (не)лепо\n3.(по)казацки, (на)скоро");
                break;
            case 4:
                System.out.println("К историческим разновидностям этнических общностей относят:\n1. Государства\n2. Сосолвия\n3. Народности");
                break;
            case 5:
                System.out.println("Как называлось переносное жилище из войлока у народов Средней Азии и Сибири?\n1. Вигрвам\n2. Юрта\n3. Иглу");
                break;
            case 6:
                System.out.println("В какой координатной четверти находится точка М (-115; 61)\n1. в I четверти \n2. в III четверти \n3. во II четверти");
                break;
            case 7:
                System.out.println("Какого органа нет у хрящевых рыб?\n1. Жабр\n2. Плавательного пузыряа\n3. Жабр");
                break;
            case 8:
                System.out.println("Гиперссылки, связывающие страницы одного сайта:\n1. Навигация\n2. Способ перемещения \n3. Способ взаимодействия");
                break;
        }
        return 0;
    }
}
