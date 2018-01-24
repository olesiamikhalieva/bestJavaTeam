package hw_23_01_18.Robot;

public class Robot {
    private Hand hand;
    private Foot foot;
    private Head head;
    private String name;

    public Robot() {
    }

    public Robot(Hand hand, Foot foot, Head head, String name) {
        this.hand = hand;
        this.foot = foot;
        this.head = head;
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeRobot() {
        if (hand.getCountOfHands() == 2 && foot.getCountOfFoots() == 2 && getHead().isHead() == true)
            System.out.println("Робот "+name+" готов, я умею говорить,я умею ходить,я умею писать.");
        if (hand.getCountOfHands() != 2)
            System.out.println("Требуется доработка: могу писать только одной рукой.");
        if (foot.getCountOfFoots() != 2)
            System.out.println("Требуется доработка: могу только прыгать на одной ноге.");
        if (getHead().isHead() != true)
            System.out.println("Требуется доработка: не могу говорить.");
    }
}
