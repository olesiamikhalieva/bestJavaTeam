package hw_02_02_18.RobotAbstract.PartsOfRobot;

public class Hand {
    int numberHand;

    public Hand() {
    }

    public Hand(int numberHand) {
        this.numberHand = numberHand;
    }


    public void getHandSkills(){
        if (numberHand==0){
            System.out.println("I don't have hands.");
        }
        else {
            System.out.println("I have " +numberHand+" hand. I can white");}
    }


    public int getNumberHand() {
        return numberHand;
    }

    public void setNumberHand(int numberHand) {
        this.numberHand = numberHand;
    }
}
