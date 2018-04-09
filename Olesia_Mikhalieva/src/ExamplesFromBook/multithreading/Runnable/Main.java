package ExamplesFromBook.multithreading.Runnable;

public class Main {
    public static void main(String[] args) {

        System.out.println("Главный поток начал работу...");
        MyThread myThread = new MyThread();
    //    new Thread(myThread, "name").start();
        System.out.println("Главный поток завершил работу...");
    }
}
