//6. Заполнить массив short типа числами от 100 до 0.
public class arr {
    public static void main(String[] args)
    {
        short arr[] = new short[101];
        for (int i = 100; i >= 0; i--)
        {
            arr[i] = (short) (100-i);
            System.out.println(arr[i]);
        }
    }
}
