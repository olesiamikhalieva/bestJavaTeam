package ExamplesFromBook.multithreading.CW.Example2;

public class TreadRun {
    public static void main(String[] args) {
        System.out.println("I'm a main thread.");
        Thread onethread = new Thread(){
            @Override
            public void run(){

                for (int i = 0; i <=40; i++){
                    System.out.println("I am a new thread, and "+i+" work");
                }
            }
        };
        onethread.start();

        System.out.println("My thread program");
        doLogic();
        System.out.println(" last road");
    }

    public static void doLogic(){
        int sum=0;
        for (int i =0; i<5; i++){
            sum+=i;
        }
        System.out.println("sum is "+sum);
    }
}
