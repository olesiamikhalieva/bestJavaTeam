package hw_23_01_18.Comp;

public class System_block {
    private HDD hdd;
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private VideoKarta videoKarta;

    public System_block() {
    }

    public System_block(HDD hdd, Keyboard keyboard, Monitor monitor, Mouse mouse, VideoKarta videoKarta) {
        this.hdd = hdd;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
        this.videoKarta = videoKarta;
    }

    public System_block(HDD hdd) {
        this.hdd = hdd;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public VideoKarta getVideoKarta() {
        return videoKarta;
    }

    public void setVideoKarta(VideoKarta videoKarta) {
        this.videoKarta = videoKarta;
    }

    public void systemBlockInfo() {
        System.out.println("Компьютер имеет следующие компоненты и характеристики: ");
        System.out.println("Винт: " + hdd.getBrand() + "," + hdd.getSize());
        System.out.println("Клавиатура: " + keyboard.getBrand() + "," + keyboard.getColor());
        if (monitor.getBrand() == "Sony") {
            System.out.println("Moнитор: " + monitor.getBrand() + "," + monitor.getSize() + " с LED подсветкой!");
        } else {
            System.out.println("Moнитор: " + monitor.getBrand() + "," + monitor.getSize() + " без LED подсветки!");
        }
        if (mouse.isWireless() == true) {
            System.out.println("Мышь: Беспроводная и без хвоста!");
        } else {
            System.out.println("Мышь: Проводная и с хвостом!");
        }
        if (videoKarta.getSizeMemory() >= 2048) {
            System.out.println("Видуха: " + videoKarta.getSizeMemory() + "Mb, игровая");
        } else {
            System.out.println("Видуха: " + videoKarta.getSizeMemory() + "Mb, не для игр");
        }
    }
}