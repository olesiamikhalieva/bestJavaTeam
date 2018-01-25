package Robot;

import Robot.ComponentsRobot.Hand;
import Robot.ComponentsRobot.Head;
import Robot.ComponentsRobot.Leg;
import Robot.ComponentsRobot.Torso;

//Todo - good
public class RobotMain {
    private static Robot robot = new Robot();

    public static void main(String[] args) {
        Head head = new Head();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        Leg leg1 = new Leg();
        Leg leg2 = new Leg();
        Torso torso = new Torso();

        robot.setHead(head);
        robot.setHand1(hand1);
        robot.setLeg1(leg1);
        robot.setTorso(torso);

        robot.getHead().speak();
        robot.getHand1().write();
        robot.getLeg1().run();
        robot.getTorso().create();

        Robot robot1 = new Robot(head,hand1,hand2,leg1,leg2,torso);
        Robot robot2 = new Robot(head,hand1,leg1,leg2,torso);
        Robot robot3 = new Robot(head,hand1,hand2,leg1,torso);
        Robot robot4 = new Robot(hand1,hand2,leg1,leg2,torso);
    }
}
