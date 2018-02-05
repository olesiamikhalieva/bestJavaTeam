package hw_26_01_18.RobotAbstract.PartsOfRobot;

public class Head {
    int countHead;

    public Head(int countHead) {
        this.countHead = countHead;
    }

    public int getCountHead(){
        return countHead;
    }

    public void getHeadSkills(){
        if (countHead!=0){
            System.out.println("I have head, that's why I can think");
        }
        if (countHead>1){
            System.out.println("I have super skills. Think faster! ");
        }
    }

    public void setCountHead(int countHead) {
        this.countHead = countHead;
    }
}
