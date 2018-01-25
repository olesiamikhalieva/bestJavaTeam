package hw_23_01_18.Comp;

public class VideoKarta {
    private int sizeMemory;
    private boolean forGames;

    public VideoKarta() {
    }

    public VideoKarta(int sizeMemory) {
        this.sizeMemory = sizeMemory;
    }

    public int getSizeMemory() {
        return sizeMemory;
    }

    public void setSizeMemory(int sizeMemory) {
        this.sizeMemory = sizeMemory;
    }

    public boolean isForGames() {
        return forGames;
    }

    public void setForGames(boolean forGames) {
        this.forGames = forGames;
    }
}

