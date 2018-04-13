package les1304;

/**
 * Created by java on 13.04.2018.
 */
public class Mediator extends Thread {
    Farm farm; //объект склада, с которого покупатель будет брать товар
    int product=0; //текущее количество товаров со склада

    Mediator(Farm farm)
    {
        this.farm =farm;
    }

    public void run() {
        try
        {
            while(product<0){// пока количество товаров не будет равно 5

                product=product+ farm.get(); //берем по одному товару со склада
                System.out.println ("Mediator take " + product + " birds");
                sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("поток потребителя прерван");
        }
    }
}
