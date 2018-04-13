package les1304;

/**
 * Created by java on 13.04.2018.
 */
public class Farm {
    int counter = 0; // счетчик товаров
    final int N = 5;

    // синхронизированный метод для производителей
    synchronized int put() {
        if(counter<=N) //если товаров меньше
        {
            counter++; // кладем товар

        System.out.println ("there are " + counter + " birds on the farm");
        return  1;
        }
        return 0;

    }
    // метод для покупателей
    synchronized int get() {
        if(counter>0) //если хоть один присутствует
        {
            counter--; //берем товар
            System.out.println ("there are " + counter + " birds on the farm");
            return 1;// в случае удачного выполнения возвращаем 1
        }
        return 0;// в случае неудачного выполнения возвращаем 0
    }
}
