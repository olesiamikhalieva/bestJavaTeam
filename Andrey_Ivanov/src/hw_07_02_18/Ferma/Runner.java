package classwork;

/**
 * Created by java on 06.02.2018.
 */
public class Runner {

    public static void main(String[] args) {


        Bird duck = new Duck();
        Bird eagl = new Eagl();
        Bird rubDuck = new RubberDuck();


        Bird[] birds = new Bird[3];

        birds[0] = eagl;
        birds[1] = duck;
        birds[2] = rubDuck;

        for (Bird bird : birds) {
            //bird.sound();
        }

        CreateEggs pingvin = new Penguin();
        CreateEggs ducks = new Duck();

        CreateEggs[] mass = new CreateEggs[2];
        mass[0]=pingvin;
        mass[1]=ducks;

        for (CreateEggs mas : mass) {
            mas.createEggs();
        }

    }

}
