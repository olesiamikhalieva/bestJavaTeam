//package hw_23_01_18.Robot;
//
//import hw_23_01_18.Robot.ComponentsRobot.*;
//import java.util.Arrays;
//
////Todo - good (23_01_18)
//public class RobotMain {
//    private static ArmWeapon armWeapon1 = new ArmWeapon();
//    private static ArmWeapon armWeapon2 = new ArmWeapon();
//    private static ArmFin armFin1 = new ArmFin();
//    private static ArmFin armFin2 = new ArmFin();
//    private static ArmWing armWing1 = new ArmWing();
//    private static ArmWing armWing2 = new ArmWing();
//    private static Head head = new Head();
//    private static Arm arm1 = new Arm();
//    private static Arm arm2 = new Arm();
//    private static Leg leg1 = new Leg();
//    private static Leg leg2 = new Leg();
//    private static Torso torso = new Torso();
//
//    public static void main(String[] args) {
//        Robot robot1 = new Robot("Генадий", head, arm1, arm2, leg1, leg2, torso);
//        Robot robot2 = new Robot("Ашот", head, arm1, arm2, leg1, leg2, torso);
//
//        RWar rWar1 = new RWar("Валли", head, armWeapon1, armWeapon2, leg1, leg2, torso);
//        RWar rWar2 = new RWar("Ева", head, armWeapon1, armWeapon2, leg1, leg2, torso);
//        RSwimming rSwimming1 = new RSwimming("Рыбин", head, armFin1, armFin2, leg1, leg2, torso);
//        RSwimming rSwimming2 = new RSwimming("Дильфин", head, armFin1, armFin2, leg1, leg2, torso);
//        RFlying rFlying1 = new RFlying("Пташко", head, armWing1, armWing2, leg1, leg2, torso);
//        RFlying rFlying2 = new RFlying("Дракоша", head, armWing1, armWing2, leg1, leg2, torso);
//
//        System.out.println(robot1.equals(robot2));
//        System.out.println(rFlying2.equals(robot1));
//        robotBro(rFlying1, rWar2);
//        robotBro(rSwimming1, rWar1);
//        robotBro(rWar2, rWar1);
//
//        int[] hashCodeMass = {robot1.hashCode(), robot2.hashCode(), rFlying1.hashCode(), rFlying2.hashCode(),
//                rSwimming1.hashCode(), rSwimming2.hashCode(), rWar1.hashCode(), rWar2.hashCode()};
//        System.out.println(Arrays.toString(hashCodeMass));
//
//        String[] toStringRobotics = {robot1.toString(), robot2.toString(), rFlying1.toString(), rFlying2.toString(),
//                rSwimming1.toString(), rSwimming2.toString(), rWar1.toString(), rWar2.toString()};
//
//        System.out.println(Arrays.toString(toStringRobotics));
//    }
//
//    public static void oldDZWithRobot23_01_18() {
//        Robot robot = new Robot();
//
//        robot.setHead(head);
//        robot.setArm1(arm1);
//        robot.setLeg1(leg1);
//        robot.setTorso(torso);
//
//        robot.getHead().speak();
//        robot.getArm1().write();
//        robot.getLeg1().run();
//        robot.getTorso().create();
//
//        Robot robot1 = new Robot("рррр", head, arm1, arm2, leg1, leg2, torso);
//        Robot robot2 = new Robot(head, arm1, leg1, leg2, torso);
//        Robot robot3 = new Robot(head, arm1, arm2, leg1, torso);
//        Robot robot4 = new Robot(arm1, arm2, leg1, leg2, torso);
//
//    }
//
//    public static void robotBro(Robot robot1, Robot robot2) {
//        if (robot1.equals(robot2)) {
//            System.out.println("Робот-брат");
//        } else {
//            System.out.println("Робот не брат");
//        }
//    }
//}
