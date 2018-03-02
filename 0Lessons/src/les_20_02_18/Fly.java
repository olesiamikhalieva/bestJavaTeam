package les_20_02_18;

/**
 * Created by java on 20.02.2018.
 */
public interface Fly {
    default void fly(){
        System.out.println("i fly 100%");
    }

    static void superFly(){
        System.out.println("Duck fly");
    }
}
