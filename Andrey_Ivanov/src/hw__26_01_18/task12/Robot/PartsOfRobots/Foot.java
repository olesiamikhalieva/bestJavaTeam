package hw__26_01_18.task12.Robot.PartsOfRobots;

import java.util.concurrent.ThreadLocalRandom;

public class Foot {
    private int countOfFoots;
    private boolean walk;


    public Foot() {
        this.walk = walk;
    }

    public int getCountOfFoots() {
        return countOfFoots;
    }

    public void setCountOfFoots() {
        int randomCount = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        this.countOfFoots = randomCount;
        if (randomCount == 2) {
            this.walk = true;
        }
    }

    public boolean isWalk() {
        return walk;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }
}
