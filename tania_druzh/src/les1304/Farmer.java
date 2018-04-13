package les1304;

/**
 * Created by java on 13.04.2018.
 */
public class Farmer extends Thread {
    Farm farm; //объект склада, куда кладем товар
    int product=5; // количество товаров, которые надо добавить

    Farmer(Farm farm)
    {
        this.farm=farm;
    }

    public void run() {
        try
        {
            while(product>0){ //пока у производителя имеются
                product = product - farm.put(); //кладем один на склад
                System.out.println ("Farmer make " + product + " birds");
                sleep(100); // время простоя
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("поток производителя прерван");
        }
    }
}
