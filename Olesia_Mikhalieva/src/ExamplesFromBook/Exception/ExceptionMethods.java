package ExamplesFromBook.Exception;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My exceptions");
        }
        catch (Exception e){
            System.out.println("Intercepted");
            System.out.println("getMessage "+e.getMessage());
            System.out.println("getLocalizedMessage()"+e.getLocalizedMessage());
            System.out.println("toString "+e);
            System.out.println("printStackTrace() ");
            e.printStackTrace(System.out);
        }

    }
}
