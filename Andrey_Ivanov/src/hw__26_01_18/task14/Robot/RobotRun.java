package hw__26_01_18.task14.Robot;

import hw__26_01_18.task14.Robot.PartsOfRobots.Foot;
import hw__26_01_18.task14.Robot.PartsOfRobots.Hand;
import hw__26_01_18.task14.Robot.PartsOfRobots.Head;
import hw__26_01_18.task14.Robot.Robots.Defender;
import hw__26_01_18.task14.Robot.Robots.Fighter;
import hw__26_01_18.task14.Robot.Robots.Medic;
import hw__26_01_18.task14.Robot.Robots.Robot;

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
        Defender defender = new Defender(hand, foot, head, "Defender", "300");
        defender.infoDefender();
        System.out.println();

        head.headYesOrNo();//метод, который проверяет,если голова есть, то робот умеет говорить
        foot.setCountOfFoots();//определение кол-ва ног случайным образом
        hand.setCountOfHands();//определенеи кол-ва рук у робота
        Medic medic = new Medic(hand, foot, head, "Medic", "150");
        medic.infoMedic();
        System.out.println();

        head.headYesOrNo();//метод, который проверяет,если голова есть, то робот умеет говорить
        foot.setCountOfFoots();//определение кол-ва ног случайным образом
        hand.setCountOfHands();//определенеи кол-ва рук у робота
        Fighter fighter = new Fighter(hand, foot, head, "Fighter", "300");
        fighter.infoFighter();
        System.out.println();

        System.out.println("Сравнение уникального параметра роботов "+defender.getName()+" и "+fighter.getName()+":"+defender.getArmor().equals(fighter.getFight()));
        System.out.println("Сравнение уникального параметра роботов "+defender.getName()+" и "+medic.getName()+":"+defender.getArmor().equals(medic.getMedicine()));
        System.out.println("Сравнение уникального параметра роботов "+medic.getName()+" и "+fighter.getName()+":"+medic.getMedicine().equals(fighter.getFight()));

        System.out.println("Сравнение роботов "+medic.getName()+" и "+fighter.getName()+":"+medic.equals(fighter));
        System.out.println("Сравнение роботов "+medic.getName()+" и "+defender.getName()+":"+medic.equals(defender));
        System.out.println("Сравнение роботов "+fighter.getName()+" и "+defender.getName()+":"+fighter.equals(defender));

    }

}