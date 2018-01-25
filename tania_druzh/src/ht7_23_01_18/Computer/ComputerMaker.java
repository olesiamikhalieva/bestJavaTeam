package ht7_23_01_18.Computer;

import ht7_23_01_18.Computer.SystemUnit.HDD;
import ht7_23_01_18.Computer.SystemUnit.SystemUnit;
import ht7_23_01_18.Computer.SystemUnit.VideoCard;


//Todo good
public class ComputerMaker {
    public static void main(String[] args) {
        HDD hdd = new HDD("Prod","500 Gb");
        VideoCard videoCard = new VideoCard("NVid");
        Monitor monitor = new Monitor("LG",19);
        Keyboard keyboard = new Keyboard("Escape");

        SystemUnit systemUnit = new SystemUnit(hdd,videoCard);

        Comp comp = new Comp(systemUnit,monitor,keyboard);
        comp.printCompInfo();
    }

}
