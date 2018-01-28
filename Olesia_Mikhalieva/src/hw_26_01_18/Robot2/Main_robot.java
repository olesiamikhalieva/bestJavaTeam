package hw_26_01_18.Robot2;

public class Main_robot {
    public static void main(String[] args) {
        Bender bender = new Bender();
        bender.getHand(1);
        bender.getBody(1);
        bender.getLeg(3);
        bender.getHead(2);
        Terminator terminator = new Terminator();
        terminator.getHand(1);
        terminator.getBody(1);
        terminator.getLeg(3);
        terminator.getHead(2);
        Verter verter = new Verter();
        verter.getHand(1);
        verter.getBody(1);
        verter.getLeg(3);
        verter.getHead(2);
        System.out.println(compare(bender, terminator, verter));

    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static boolean compare(Bender bender, Terminator terminator, Verter verter) {
//        if ((bender.getHead() == terminator.getHead()) && (bender.getLeg() == terminator.getLeg()) && (bender.getBody() == terminator.getBody()) && (bender.getHand() == terminator.getHand())) {
//            System.out.println("Robot-brother: Bender & Terminator");
//        }
//        if ((bender.getHead() == verter.getHead()) && (bender.getLeg() == verter.getLeg()) && (bender.getBody() == verter.getBody()) && (bender.getHand() == verter.getHand())) {
//            System.out.println("Robot-brother: Bender & Verter");
//        }
//        if ((verter.getHead() == terminator.getHead()) && (verter.getLeg() == terminator.getLeg()) && (verter.getBody() == terminator.getBody()) && (verter.getHand() == terminator.getHand())) {
//            System.out.println("Robot-brother: Verter & Terminator");
//        }
        if (bender.equals(terminator) && bender.hashCode() == terminator.hashCode()) {
            System.out.println("Robot-brother: Bender & Terminator");
            return true;
        }
        if (bender.equals(verter) && bender.hashCode() == verter.hashCode()) {
            System.out.println("Robot-brother: Bender & Verter");
            return true;
        }
        if (verter.equals(terminator) && verter.hashCode() == terminator.hashCode()) {
            System.out.println("Robot-brother: Verter & Terminator");
            return true;
        }
        return false;
    }

}
