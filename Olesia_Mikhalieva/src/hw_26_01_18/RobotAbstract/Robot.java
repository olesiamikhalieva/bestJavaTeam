package hw_26_01_18.RobotAbstract;

import hw_26_01_18.RobotAbstract.PartsOfRobot.Body;
import hw_26_01_18.RobotAbstract.PartsOfRobot.Hand;
import hw_26_01_18.RobotAbstract.PartsOfRobot.Head;
import hw_26_01_18.RobotAbstract.PartsOfRobot.Leg;

public abstract class Robot {
    Head head;
    Body body;
    Leg leg;
    Hand hand;

    public Robot() {
    }

    public Robot(Head head, Body body, Leg leg, Hand hand) {
        this.head = head;
        this.body = body;
        this.leg = leg;
        this.hand = hand;
    }


    public abstract Head getHead();

    public abstract Body getBody();

    public abstract Leg getLeg();

    public abstract Hand getHand();
}
