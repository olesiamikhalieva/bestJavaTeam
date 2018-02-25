package hw_27_12_17;
//7. Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями. Вывести эти 2 элемента на экран,
// а также посчитать и вывести сумму всех остальных элементов (min и max в сумму не входят).
public class arrMinMax {
    public static void main(String[] args)
    {
        short fin = 0;
        short i;
        short arr[] = new short[101];
        for (i = 100; i >= 0; i--)
        {
            arr[i] = (short) (100-i);
        }

        short max = arr[0];
        short min = arr[0];

        for(i = 0; i <=100; i++)
        {
            if (arr[i] >= max)
                max = arr[i];
            if (arr[i] <= min)
                min = arr[i];
        }
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);
        for(i = 0; i <= 100; i++)
        {
            if (arr[i] == min ||arr[i] == max) continue;
            fin += arr[i];
        }
        System.out.println(fin);
    }
}
