package hw_23_01_18.Computer;

public class SystemUnit {
    int rAM;

    public SystemUnit(int rAM) {
        this.rAM = rAM;
    }

    public int getrAM() {
        if (rAM>4){
            System.out.println("Fast computer");
        }
        return rAM;
    }


}
