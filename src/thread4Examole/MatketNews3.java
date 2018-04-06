package thread4Examole;

public	class	MatketNews3	extends	Thread	{
    public	MatketNews3	(String	str)	{
        super(str);
    }

    public	void	run()	{
        try{
            for	(int i=0;	i<10;i++){
                sleep(1000);		//	sleep	for	1	second
                System.out.println(	"The	market	is	improving	"	+	i);
            }
        }catch(InterruptedException	e){
            System.out.println(Thread.currentThread().getName()
                    +	e.toString());
        }
    }
}