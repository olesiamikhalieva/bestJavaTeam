package hw_02_02_18.RobotAbstract.PartsOfRobot;

public class Leg {
    private int numberLeg;

    public Leg() {
    }

    public Leg(int numberLeg) {
    }


    public void getLegSkills(){
        if (numberLeg==0){
            System.out.println("I don't have legs.");
        }
        if (numberLeg==1){
            System.out.println("I can jump.");
        }
        else {
            System.out.println("I can run.");
        }
    }

    public int getNumberLeg () {
        return numberLeg;
    }

    public void setNumberLeg(int numberLeg) {
        this.numberLeg = numberLeg;
    }
}
