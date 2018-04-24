package lesLom;

import javax.jws.soap.SOAPBinding;

/**
 * Created by java on 24.04.2018.
 */
public class Runner {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Vasia");
        user.setAge(15);
        //User user1 = new User("Vita",15);
        System.out.println(user.getName() + user.getAge());
        //System.out.println(user1.getName() + user1.getAge());


        User user2 = new User.UserBuilder().age(12).countPeacesOfShit(10).lol(true).build();
        System.out.println(user2);
    }

}
