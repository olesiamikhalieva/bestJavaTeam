package Robot;


public class Robot {
    private static Hand hand;
    private static Head head;
    private static Body body;
    private static Leg leg;
    private static int quolityOfHead = 0;
    private static int quolityOfHand = 0;
    private static int quolityOfBody = 0;
    private static int quolityOfLeg = 0;
    private static Robot robot = new Robot();


    public static void main(String[] args) {
        robot.getBody(1);
        robot.getHand(2);
        robot.getLeg(5);
        robot.getHead(1);
        ifRobotRight(robot);
    }


    private static void ifRobotRight(Robot robot) {
        if ((quolityOfHead == 1) && (quolityOfBody == 1) && (quolityOfHand == 2) && (quolityOfLeg) == 2) {
            System.out.println("Robot is right!!!");
            robot.getHand().write();
            robot.getHead().tell();
            robot.getLeg().walk();
        } else {
            System.out.println("Robot needs to rework");
            if (quolityOfLeg == 1) {
                System.out.println("I can jump on one leg.");
            }
            if (quolityOfHand == 1) {
                System.out.println("I can write by one hand.");
            }
            if (quolityOfHead == 0) {
                System.out.println("I can't speak.");
            }
        }
    }


    public Hand getHand() {
        Hand hand = new Hand();
        return hand;
    }

    public static Head getHead() {
        Head head = new Head();
        return head;
    }

    public static Body getBody() {
        Body body = new Body();
        return body;
    }

    public static Leg getLeg() {
        Leg leg = new Leg();
        return leg;
    }

    private void getHand(int quolityOfHand) {
        this.quolityOfHand = quolityOfHand;
        for (int i = 0; i < quolityOfHand; i++) {
            Hand hand = new Hand();
        }
    }

    private void getLeg(int quolityOfLeg) {
        this.quolityOfLeg = quolityOfLeg;
        for (int i = 0; i < quolityOfLeg; i++) {
            Leg leg = new Leg();
        }
    }

    private void getHead(int quolityOfHead) {
        this.quolityOfHead = quolityOfHead;
        for (int i = 0; i < quolityOfHead; i++) {
            Head head = new Head();
        }
    }

    private void getBody(int quolityOfBody) {
        this.quolityOfBody = quolityOfBody;
        for (int i = 0; i < quolityOfBody; i++) {
            Body body = new Body();
        }
    }

}
