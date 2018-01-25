package ht7_23_01_18.Computer.SystemUnit;

public class SystemUnit {
    private HDD hdd;
    private VideoCard videoCard;

    public SystemUnit() {
    }

    public SystemUnit(HDD hdd, VideoCard videoCard) {
        this.hdd = hdd;
        this.videoCard = videoCard;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void printUnitStatus(){
        System.out.println("HDD: " + hdd.getModel() + " " + hdd.getValue());
        System.out.println("Video card: " + videoCard.getModel());
    }
}
