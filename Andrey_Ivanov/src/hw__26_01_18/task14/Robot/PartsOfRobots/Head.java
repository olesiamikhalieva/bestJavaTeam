package hw__26_01_18.task14.Robot.PartsOfRobots;

public class Head {
    private boolean head;
    private boolean speak;

    public Head() {
    }

    public Head(boolean head) {
        this.head = head;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    public boolean isSpeak() {
        return speak;
    }
    public void setSpeak(boolean speak) {
        this.speak = speak;
    }
    public void headYesOrNo(){
        if (this.head==true){
            this.speak=true;
        }
    }
}
