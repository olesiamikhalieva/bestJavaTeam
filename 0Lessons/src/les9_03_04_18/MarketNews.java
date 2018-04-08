package les9_03_04_18;

public class MarketNews extends Thread {

    public MarketNews(String threadName) {
        super(threadName); // name your thread
    }

    @Override
    public	void	run()	{
        try{
            for	(int i=0;	i<10;i++){
                sleep	(1000);		//	sleep	for	1	second
                System.out.println(	"The	market	is	improving	"	+	i);
            }
        }catch(InterruptedException	e	){
            System.out.println(Thread.currentThread().getName()
                    +	e.toString());
        }
    }
}