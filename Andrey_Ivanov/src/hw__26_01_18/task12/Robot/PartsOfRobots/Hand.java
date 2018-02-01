package hw__26_01_18.task12.Robot.PartsOfRobots;

import java.util.concurrent.ThreadLocalRandom;

public class Hand {
    private int countOfHands;
    private boolean write;

    public Hand() {
        this.write = write;
    }

    public int Hand() {
        return getCountOfHands();
    }

    public int getCountOfHands() {
        return countOfHands;
    }

    public void setCountOfHands() {
        int randomCount= ThreadLocalRandom.current().nextInt(1, 2 + 1) ;
        this.countOfHands = randomCount;
        if (randomCount==2){
            this.write=true;
        }
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }
}
