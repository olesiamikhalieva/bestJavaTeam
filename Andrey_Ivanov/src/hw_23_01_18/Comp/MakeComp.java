package hw_23_01_18.Comp;

public class MakeComp {

    public static void main(String[] args) {

        HDD hdd=new HDD("WD","2Tb");
        Keyboard keyboard=new Keyboard("white","Logitech");
        Monitor monitor=new Monitor("Sony",21);
        Mouse mouse=new Mouse();
        VideoKarta videoKarta=new VideoKarta(2048);

        System_block system_block=new System_block(hdd,keyboard,monitor,mouse,videoKarta);

        system_block.systemBlockInfo();//метод который выводит конфигурациюю компа



    }


}
