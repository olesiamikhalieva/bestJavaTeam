package ExamplesFromBook.multithreading;

public class Main {
    public static void main(String[] args) {

        System.out.println("Главный поток начал работу...");
        new JThread("JThread").start();
        System.out.println("Главный поток завершил работу...");

        System.out.println("Главный поток начал работу...");
        JThread t= new JThread("JThread ");
        t.start();
        try{
            t.join();//Метод join() заставляет вызвавший поток (в данном случае главный поток)
            // ожидать завершения вызываемого потока, для которого и применяется метод join (в данном случае поток JThread).
        }
        catch(InterruptedException e){

            System.out.printf("Поток %s прерван", t.getName());
        }
        System.out.println("Главный поток завершил работу...");
    }
}
