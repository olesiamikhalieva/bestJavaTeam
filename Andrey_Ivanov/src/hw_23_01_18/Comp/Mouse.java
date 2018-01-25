package hw_23_01_18.Comp;

public class Mouse {
    private boolean wireless;
    private boolean tail;//есть у мышки хвост или нет

    public Mouse() {
    }

    public Mouse(boolean wireless) {
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public boolean isTail() {
        return tail;
    }
}
