package thread2Example;

public class ThreadTestRun {

    public static void main(String[] args) {

        System.out.println(" i am a main thread");

        Thread oneThread = new Thread() {
            @Override
            public void run() {

                for (int i = 0; i <= 40; i++) {
                    System.out.println(" I am new thread, and i Work");
                }
            }
        };

        oneThread.start();


        System.out.println(" My thread program");
        doLogic();
        System.out.println(" last row");

    }

    public static void doLogic() {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("sum is -> "+sum);
    }
}
