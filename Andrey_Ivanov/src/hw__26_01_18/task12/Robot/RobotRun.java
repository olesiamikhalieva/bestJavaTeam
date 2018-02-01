package hw__26_01_18.task12.Robot;

import hw__26_01_18.task12.Robot.PartsOfRobots.Foot;
import hw__26_01_18.task12.Robot.PartsOfRobots.Hand;
import hw__26_01_18.task12.Robot.PartsOfRobots.Head;
import hw__26_01_18.task12.Robot.Robots.Defender;
import hw__26_01_18.task12.Robot.Robots.Fighter;
import hw__26_01_18.task12.Robot.Robots.Medic;
import hw__26_01_18.task12.Robot.Robots.Robot;

public class RobotRun {

    public static void main(String[] args) {
        Head head = new Head(true);
        Hand hand = new Hand();
        Foot foot = new Foot();

        head.headYesOrNo();//метод, который проверяет,если голова есть, то робот умеет говорить
        foot.setCountOfFoots();//определение кол-ва ног случайным образом
        hand.setCountOfHands();//определенеи кол-ва рук у робота
        Robot robot = new Robot(hand, foot, head, "First");//имя робота
        robot.infoRobot();
        System.out.println();

        head.headYesOrNo();//метод, который проверяет,если голова есть, то робот умеет говорить
        foot.setCountOfFoots();//определение кол-ва ног случайным образом
        hand.setCountOfHands();//определенеи кол-ва рук у робота
        Defender defender = new Defender(hand, foot, head, "Defender", "100");
        defender.infoDefender();

        head.headYesOrNo();//метод, который проверяет,если голова есть, то робот умеет говорить
        foot.setCountOfFoots();//определение кол-ва ног случайным образом
        hand.setCountOfHands();//определенеи кол-ва рук у робота
        Medic medic = new Medic(hand, foot, head, "Medic", "150");
        medic.infoMedic();

        head.headYesOrNo();//метод, который проверяет,если голова есть, то робот умеет говорить
        foot.setCountOfFoots();//определение кол-ва ног случайным образом
        hand.setCountOfHands();//определенеи кол-ва рук у робота
        Fighter fighter = new Fighter(hand, foot, head, "Fighter", "300");
        fighter.infoFighter();

        System.out.println(medic.getFoot().equals(defender.getFoot()));
    }

}