package hw_12_01_18_SUPER_HARD_LEVEL;
public class School {

    private int numberOfSchool;
    private String address;
    private String numberPhoneOfSchoolReception;
    private String classLetter = "";

    public void showAllClassesLetter(ClassRoom[] classRoomMass) {
        System.out.println("В этой школе есть классы: ");
        for (int i = 0; i < classRoomMass.length; i++){
            System.out.print(classRoomMass[i].getClassWord() + "  ");
            classLetter += classRoomMass[i].getClassWord() + " ";
        }
        System.out.println("\n" + classLetter);
        System.out.println(" \n ");
    }

    public int getNumberOfSchool() {
        return numberOfSchool;
    }

    public void setNumberOfSchool(int numberOfSchool) {
        this.numberOfSchool = numberOfSchool;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhoneOfSchoolReception() {
        return numberPhoneOfSchoolReception;
    }

    public void setNumberPhoneOfSchoolReception(String numberPhoneOfSchoolReception) {
        this.numberPhoneOfSchoolReception = numberPhoneOfSchoolReception;
    }

    public String getClassLetter() {
        return classLetter;
    }

    public void setClassLetter(String classLetter) {
        this.classLetter = classLetter;
    }
}
