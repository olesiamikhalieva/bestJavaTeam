package hw_26_01_18.RobotAbstract;

import hw_26_01_18.RobotAbstract.PartsOfRobot.Body;
import hw_26_01_18.RobotAbstract.PartsOfRobot.Hand;
import hw_26_01_18.RobotAbstract.PartsOfRobot.Head;
import hw_26_01_18.RobotAbstract.PartsOfRobot.Leg;

import java.util.Arrays;

public class RobotRunner {

    private static Robot[] robotsMass = new Robot[0];
    private static String[] superSkillsMass;

    public static void main(String[] args) {
        FlyRobot flyRobot = new FlyRobot(new Head(1), new Body(true), new Leg(2), new Hand(2), "fly");
        Transformer transformer = new Transformer(new Head(1), new Body(true), new Leg(2), new Hand(2), "change");
        FireRobot fireRobot = new FireRobot(new Head(3), new Body(true), new Leg(3), new Hand(2), "fire");
        addRobotMass(fireRobot);
        addRobotMass(transformer);
        addRobotMass(flyRobot);
        printRobotsMass();
        System.out.println();

        System.out.println("Compare robots' parts:");
        compareRobotParts();
        System.out.println("Compare robots' skills:");
        compareRobotsSuperSkills(mass3RobotsSuperSkills(flyRobot, transformer, fireRobot));

        FlyRobot flyRobot1 = new FlyRobot(new Head(1), new Body(true), new Leg(2), new Hand(2), "fly");
        Transformer transformer1 = new Transformer(new Head(1), new Body(true), new Leg(2), new Hand(2), "change");
        FireRobot fireRobot1 = new FireRobot(new Head(3), new Body(true), new Leg(3), new Hand(2), "fire");
        addRobotMass(fireRobot1);
        addRobotMass(transformer1);
        addRobotMass(flyRobot1);
        System.out.println();
        printRobotsMass();
        System.out.println();
        System.out.println("Compare robots' skills:");
        compareRobotsSuperSkills(mass6RobotsSuperSkills(flyRobot, flyRobot1, transformer, transformer1, fireRobot, fireRobot1));

        System.out.println();

        fireRobot.setName("Frodo");
        fireRobot1.setName("Amigo");
        flyRobot.setName("Batman");
        flyRobot1.setName("Superman");
        transformer.setName("Kusya");
        transformer1.setName("Saturn");
        printHashcodeMass();

        System.out.println();

        printmass6RobotsClassName(flyRobot, flyRobot1, transformer, transformer1, fireRobot, fireRobot1);

        System.out.println();

        printRobotsMass();

        System.out.println();

        compareHashcodeRobot(hashCodeMass(),flyRobot,flyRobot1,transformer,transformer1,fireRobot,fireRobot1);

    }

    private static void compareRobotParts() {
        for (int i = robotsMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (robotsMass[i].getBody().isExist() == robotsMass[j].getBody().isExist()) {
                    if (robotsMass[i].getHand().getNumberHand() == (robotsMass[j].getHand().getNumberHand())) {
                        if (robotsMass[i].getHead().getCountHead() == (robotsMass[j].getHead().getCountHead())) {
                            if (robotsMass[i].getLeg().getNumberLeg() == robotsMass[j].getLeg().getNumberLeg()) {
                                System.out.println("Robot brother: " + robotsMass[i] + " and " + robotsMass[j] + " = true ");
                            }
                        }
                    }
                }
            }
        }
    }

    private static void addRobotMass(Robot robot) {
        robotsMass = Arrays.copyOf(robotsMass, robotsMass.length + 1);
        for (int i = 0; i < robotsMass.length; i++) {
            if (robotsMass[i] == null) {
                robotsMass[i] = robot;
                break;
            }
        }
    }


    private static String[] mass3RobotsSuperSkills(FlyRobot flyRobot, Transformer transformer, FireRobot fireRobot) {
        String[] massRobotsSuperSkills = new String[3];
        massRobotsSuperSkills[0] = flyRobot.getSuperSkill();
        massRobotsSuperSkills[1] = transformer.getSuperSkill();
        massRobotsSuperSkills[2] = fireRobot.getSuperSkills();
        return massRobotsSuperSkills;
    }

    private static String[] mass6RobotsSuperSkills(FlyRobot flyRobot, FlyRobot flyRobot1, Transformer transformer, Transformer transformer1, FireRobot fireRobot, FireRobot fireRobot1) {
        String[] massRobotsSuperSkills = new String[robotsMass.length];
        for (int i = 0; i < robotsMass.length; i++) {
            if (robotsMass[i] == transformer) {
                massRobotsSuperSkills[i] = transformer.getSuperSkill();
            }
            if (robotsMass[i] == transformer1) {
                massRobotsSuperSkills[i] = transformer1.getSuperSkill();
            }
            if (robotsMass[i] == fireRobot) {
                massRobotsSuperSkills[i] = flyRobot.getSuperSkill();
            }
            if (robotsMass[i] == flyRobot1) {
                massRobotsSuperSkills[i] = flyRobot1.getSuperSkill();
            }
            if (robotsMass[i] == fireRobot) {
                massRobotsSuperSkills[i] = fireRobot.getSuperSkills();
            }
            if (robotsMass[i] == fireRobot1) {
                massRobotsSuperSkills[i] = fireRobot1.getSuperSkills();
            }
        }
        return massRobotsSuperSkills;
    }

    private static void compareRobotsSuperSkills(String[] massRobotsSuperSkills) {
        int k = 0;
        for (int i = massRobotsSuperSkills.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massRobotsSuperSkills[i] == massRobotsSuperSkills[j]) {
                    System.out.println("Robot brother: " + robotsMass[i] + " and " + robotsMass[j]);
                    k++;
                    break;
                }
            }
        }
        if (k == 0) {
            System.out.println("There are no brothers between robots.");
        }


    }

    private static void printRobotsMass() {
        System.out.println("Robots:");
        for (Robot rob : robotsMass) {
            System.out.print(rob + "   -//-   ");
        }
    }

    private static int[] hashCodeMass() {
        int[] massHashcodeRobot = new int[robotsMass.length];
        for (int i = 0; i < robotsMass.length; i++) {
            massHashcodeRobot[i] = robotsMass[i].hashCode();
        }
        return massHashcodeRobot;
    }


    private static void printHashcodeMass() {
        for (int hashcode : hashCodeMass()) {
            System.out.print(hashcode + " //");
        }
    }

    private static void printmass6RobotsClassName(FlyRobot flyRobot, FlyRobot flyRobot1, Transformer transformer, Transformer transformer1, FireRobot fireRobot, FireRobot fireRobot1) {
        System.out.println("Class and name of robot:");
        String[] massRobotsClassName = new String[robotsMass.length];
        for (int i = 0; i < robotsMass.length; i++) {
            if (robotsMass[i] == transformer) {
                massRobotsClassName[i] = transformer.getSuperSkill();
                System.out.println(robotsMass[i].getClass() + " - " + massRobotsClassName[i]);
            }
            if (robotsMass[i] == transformer1) {
                massRobotsClassName[i] = transformer1.getSuperSkill();
                System.out.println(robotsMass[i].getClass() + " - " + massRobotsClassName[i]);
            }
            if (robotsMass[i] == fireRobot) {
                massRobotsClassName[i] = flyRobot.getSuperSkill();
                System.out.println(robotsMass[i].getClass() + " - " + massRobotsClassName[i]);
            }
            if (robotsMass[i] == fireRobot1) {
                massRobotsClassName[i] = fireRobot1.getSuperSkills();
                System.out.println(robotsMass[i].getClass() + " - " + massRobotsClassName[i]);
            }
            if (robotsMass[i] == fireRobot) {
                massRobotsClassName[i] = fireRobot.getSuperSkills();
                System.out.println(robotsMass[i].getClass() + " - " + massRobotsClassName[i]);
            }
            if (robotsMass[i] == fireRobot1) {
                massRobotsClassName[i] = fireRobot1.getName();
                System.out.println(robotsMass[i].getClass() + " - " + massRobotsClassName[i]);
            }
        }
    }


    private static void compareHashcodeRobot(int[] massHashcodeRobot,FlyRobot flyRobot, FlyRobot flyRobot1, Transformer transformer, Transformer transformer1, FireRobot fireRobot, FireRobot fireRobot1) {
        for (int i= massHashcodeRobot.length-1; i>0; i--) {
            for (int j = 0; j<i; j++) {
                if (massHashcodeRobot[i] == robotsMass[j].hashCode()) {
                    if (robotsMass[i] == transformer) {
                        System.out.println(transformer.getSuperSkill() + transformer.hashCode());
                    }
                    if (robotsMass[i] == transformer1) {
                        System.out.println(transformer1.getSuperSkill() + transformer1.hashCode());
                    }
                    if (robotsMass[i] == fireRobot) {
                        System.out.println(fireRobot.getSuperSkills() + fireRobot.hashCode());
                    }
                    if (robotsMass[i] == fireRobot1) {
                        System.out.println(fireRobot1.getSuperSkills() + fireRobot1.hashCode());
                    }
                    if (robotsMass[i] == flyRobot) {
                        System.out.println(flyRobot.getSuperSkill() + flyRobot.hashCode());
                    }
                    if (robotsMass[i] == flyRobot1) {
                        System.out.println(flyRobot1.getSuperSkill() + flyRobot1.hashCode());
                    }
                }
                }
            }
        }
    }


