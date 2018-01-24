package hw_23_01_18.Robot;

import hw_23_01_18.Robot.Foot;
import hw_23_01_18.Robot.Robot;

public class RobotRun {

    public static void main(String[] args) {

        Robot robot = new Robot();//имя робота
        robot.setName("Verter");

        Head head = new Head(true);
        head.headYesOrNo();//метод, который проверяет,если голова есть, то робот умеет говорить
        robot.setHead(head);//добавление головы роботу

        Foot foot = new Foot();
        foot.setCountOfFoots();//определение кол-ва ног случайным образом
        robot.setFoot(foot);//добавление ног роботу

        Hand hand = new Hand();
        hand.setCountOfHands();//определенеи кол-ва рук у робота
        robot.setHand(hand);//добавление рук роботу

        System.out.println("Кол-во рук у робота:"+robot.getHand().getCountOfHands());
        System.out.println("Кол-во ног у робота:"+robot.getFoot().getCountOfFoots());
        System.out.println("У робота есть голова:"+robot.getHead().isHead());
        System.out.println("Робот умеет писать:"+robot.getHand().isWrite());
        System.out.println("Робот умеет ходить:"+robot.getFoot().isWalk());
        System.out.println("Робот умеет говорить:"+robot.getHead().isSpeak()+"\n");


        robot.makeRobot();//метод который проверяет сколько рук, ног и есть ли голова.
    }
}

