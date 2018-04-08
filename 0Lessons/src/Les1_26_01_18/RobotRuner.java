package Les1_26_01_18;

/**
 * Created by java on 26.01.2018.
 */
public class RobotRuner {
    public static Robot robot = new Robot();

    public static void main(String[] args) {
//        robot.thinking();
//        robot.setCpu(3);
//        robot.thinking();
//
//        ChapyRobot chp = new ChapyRobot();
//        chp.setCpu(2);
//        chp.thinking();
        Transformer transformer = new Transformer();
        transformer.setName("Ivar");
        System.out.println(transformer);
        transformer.thinking();
//        transformer.setSerialNumber(123456);
//        transformer.setName("fighter");
//        transformer.getName();
//        transformer.setSword(true);
//        transformer.fight();


        System.out.println("---------------------------------------------------");

        SimplyRobot simplyRobot = new SimplyRobot();



    }
}
