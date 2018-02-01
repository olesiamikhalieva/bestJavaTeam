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
        Defender defenderFirst = new Defender(hand, foot, head, "Defender1", 100);
        Defender defenderSecond = new Defender(hand, foot, head, "Defender2", 200);
        defenderFirst.infoDefender();
        defenderSecond.infoDefender();
        System.out.println();

        head.headYesOrNo();//метод, который проверяет,если голова есть, то робот умеет говорить
        foot.setCountOfFoots();//определение кол-ва ног случайным образом
        hand.setCountOfHands();//определенеи кол-ва рук у робота
        Medic medicFirst = new Medic(hand, foot, head, "Medic1", 150);
        Medic medicSecond = new Medic(hand, foot, head, "Medic2", 300);
        medicFirst.infoMedic();
        medicSecond.infoMedic();
        System.out.println();

        head.headYesOrNo();//метод, который проверяет,если голова есть, то робот умеет говорить
        foot.setCountOfFoots();//определение кол-ва ног случайным образом
        hand.setCountOfHands();//определенеи кол-ва рук у робота
        Fighter fighterFirst = new Fighter(hand, foot, head, "Fighter1", 400);
        Fighter fighterSecond = new Fighter(hand, foot, head, "Fighter2", 250);
        fighterFirst.infoFighter();
        fighterSecond.infoFighter();
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Сравнение роботов " + medicFirst.getName() + " и " + fighterFirst.getName() + ":" + medicFirst.equals(fighterFirst));
        System.out.println("Сравнение роботов " + medicFirst.getName() + " и " + defenderFirst.getName() + ":" + medicFirst.equals(defenderFirst));
        System.out.println("Сравнение роботов " + fighterFirst.getName() + " и " + defenderFirst.getName() + ":" + fighterFirst.equals(defenderFirst));
        System.out.println("-----------------------------------------------");


        Robot[] massRobots = new Robot[6];//создание массива в который положил всех роботов с классом и именем
        massRobots[0] = defenderFirst;
        massRobots[1] = defenderSecond;
        massRobots[2] = medicFirst;
        massRobots[3] = medicSecond;
        massRobots[4] = fighterFirst;
        massRobots[5] = fighterSecond;

        for (int i = 0; i < massRobots.length; i++) {
            System.out.println("Робот " + massRobots[i].getName() + " в классе " + massRobots[i].getClass());
        }

        System.out.println("-------------------------------");

        int[] massHashCode = new int[6];//создание массива для хранения хеш-кодов каждого робота

        massHashCode[0] = defenderFirst.hashCode();
        massHashCode[1] = defenderSecond.hashCode();
        massHashCode[2] = medicFirst.hashCode();
        massHashCode[3] = medicSecond.hashCode();
        massHashCode[4] = fighterFirst.hashCode();
        massHashCode[5] = fighterSecond.hashCode();

        System.out.println("Вывод хеш-кодов всех роботов:");

        for (int i = 0; i < massHashCode.length; i++) {//вывод хеш-кодов каждого робота
            System.out.println(massHashCode[i]);
        }
        System.out.println("---------------------------");

        for (int i = 0; i < massHashCode.length; i++) {
                if (massHashCode[i] == defenderFirst.hashCode()) {
                    defenderFirst.setArmor(defenderFirst.getArmor() + defenderFirst.hashCode());
                }
                if (massHashCode[i] == defenderSecond.hashCode()) {
                    defenderSecond.setArmor(defenderSecond.getArmor() + defenderSecond.hashCode());
                }
                if (massHashCode[i] == medicFirst.hashCode()) {
                    medicFirst.setMedicine(medicFirst.getMedicine() + medicFirst.hashCode());
                }
                if (massHashCode[i] == medicSecond.hashCode()) {
                    medicSecond.setMedicine(medicSecond.getMedicine() + medicSecond.hashCode());
                }
                if (massHashCode[i] == fighterFirst.hashCode()) {
                    fighterFirst.setFight(fighterFirst.getFight() + fighterFirst.hashCode());
                }
                if (massHashCode[i] == fighterSecond.hashCode()) {
                    fighterSecond.setFight(fighterSecond.getFight() + fighterSecond.hashCode());
                }
            }
            //вывод роботов с новым уникальным параметром(+хеш-код)
        System.out.println("У робота "+defenderFirst.getName()+" изменился уникальный параметр="+defenderFirst.getArmor());
        System.out.println("У робота "+defenderSecond.getName()+" изменился уникальный параметр="+defenderSecond.getArmor());
        System.out.println("У робота "+medicFirst.getName()+" изменился уникальный параметр="+medicFirst.getMedicine());
        System.out.println("У робота "+medicSecond.getName()+" изменился уникальный параметр="+medicSecond.getMedicine());
        System.out.println("У робота "+fighterFirst.getName()+" изменился уникальный параметр="+fighterFirst.getFight());
        System.out.println("У робота "+fighterSecond.getName()+" изменился уникальный параметр="+fighterSecond.getFight());
    }
}


