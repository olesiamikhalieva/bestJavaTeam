package task1;

public class Eva extends Adam {

    public void eva(){
        System.out.println("Я Ева, унаследована от Адама ");
    }

    public Eva() {
    }

    public Eva(String name, String gender) {
        super(name, gender);
    }
}
