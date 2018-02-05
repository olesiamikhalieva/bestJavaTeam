package task14;

import task14.ComponentsRobot.*;
import task14.NewRobot.RDefender;
import task14.NewRobot.RFight;
import task14.NewRobot.RFly;


//Todo - good (23_01_18)
public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Head head = new Head();
        Arm armL = new Arm("L");
        Arm armR = new Arm("R");
        Leg legL = new Leg("L");
        Leg legR = new Leg("R");
        Torso torso = new Torso();

        Robot robot1 = new Robot("Гоша", new Head(), new Arm("L"), new Arm("R"), new Leg("L"), new Leg("R"), new Torso());
        Robot robot2 = new Robot("Кеша", new Head(), new Arm("L"), new Arm("R"), new Leg("L"), new Leg("R"), new Torso());
        Robot rDefender1 = new RDefender("Вася", new Head(), new Arm("L"), new Arm("R"), new Leg("L"), new Leg("R"), new Torso(), "Жизни-1000");
        Robot rDefender2 = new RDefender("Щит", new Head(), new Arm("L"), new Arm("R"), new Leg("L"), new Leg("R"), new Torso(), "Жизни-1000");
        Robot rFight1 = new RFight("Кулак",head, armL, armR, legL, legR, torso, "Сила-1000");
        Robot rFight2 = new RFight("Бита", head, armL, armR, legL, legR, torso,"Сила-1000");
        Robot rFly1 = new RFly("Крыло", head, armL, armR, legL, legR, torso, "Полет-1000");
        Robot rFly2 = new RFly("Пропеллер", head, armL, armR, legL, legR, torso, "Полет-1000");

        System.out.println(rDefender1.equals(rDefender2));

//        Robot[] robotMass = {robot1, robot2, rFight1, rFight2, rFly1, rFly2, rDefender1, rDefender2};
//        for (int i = 0; i < robotMass.length; i++) {
//            for (int j = 0; j < robotMass.length; j++) {
//                if (robotMass[i] == robotMass[j]) {
//                    System.out.println(robotMass[i].equals(robotMass[j]));
//                    System.out.println(robotMass[i].toString());
//                    System.out.println(robotMass[j].toString());
//                }
//
//            }
//
//        }

    }

    public static void oldDZWithRobot23_01_18() {
        Robot robot = new Robot();
        Head head = new Head();
        Arm arm1 = new Arm();
        Arm arm2 = new Arm();
        Leg leg1 = new Leg();
        Leg leg2 = new Leg();
        Torso torso = new Torso();

        robot.setHead(head);
        robot.setArm1(arm1);
        robot.setLeg1(leg1);
        robot.setTorso(torso);

        robot.getHead().speak();
        robot.getArm1().write();
        robot.getLeg1().run();
        robot.getTorso().create();

        Robot robot1 = new Robot("рррр", head, arm1, arm2, leg1, leg2, torso);
        Robot robot2 = new Robot(head, arm1, leg1, leg2, torso);
        Robot robot3 = new Robot(head, arm1, arm2, leg1, torso);
        Robot robot4 = new Robot(arm1, arm2, leg1, leg2, torso);

    }

    public static void robotBro(Robot robot1, Robot robot2) {
        if (robot1.equals(robot2)) {
            System.out.println("Робот-брат");
        } else {
            System.out.println("Робот не брат");
        }
    }
}

