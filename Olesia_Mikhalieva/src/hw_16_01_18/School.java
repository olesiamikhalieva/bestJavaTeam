package hw_16_01_18;

public class School {
    private int numberSchool;
    private String adressSchool;
    private int phoneSchool;
    private ClassRoom [] schoolListOfClass;
    private ClassRoom classRoom;
    private int classCount;
    private String classWord;

    public School() {
        ClassRoom classA = new ClassRoom("A","ukr");
        ClassRoom classB = new ClassRoom("B","ukr");
        ClassRoom classC = new ClassRoom("C","eng");
        ClassRoom classD = new ClassRoom("D","eng");
        schoolListOfClass = new ClassRoom[4];
        schoolListOfClass[0] = classA;
        schoolListOfClass[1] = classB;
        schoolListOfClass[2] = classC;
        schoolListOfClass[3] = classD;
    }

    public int getClassCount() {
        return classCount;
    }

    public School(int classCount) {
        this.classCount = classCount;
            schoolListOfClass = new ClassRoom[classCount];
            for (int i = 0; i<schoolListOfClass.length; i++){
                classRoom = new ClassRoom();
                schoolListOfClass[i] = classRoom;
            }
    }

    public School(int numberSchool, String adressSchool, int phoneSchool, ClassRoom[] schoolListOfClass) {
        this.numberSchool = numberSchool;
        this.adressSchool = adressSchool;
        this.phoneSchool = phoneSchool;
        this.schoolListOfClass = schoolListOfClass;
    }

    public String classWordClassCount(int classCount, ClassRoom [] schoolListOfClass){
        for (int i = 0; i<schoolListOfClass.length; i++){
        switch (i){
            case 0: schoolListOfClass[0].setClassWord("A");
            break;
            case 1: schoolListOfClass[1].setClassWord("B");
            break;
            case 2: schoolListOfClass[2].setClassWord("D");
            break;
            case 3: schoolListOfClass[3].setClassWord("C");
            default:
                System.out.println("There are no so many classes at school.");
        }}
        return classWord;
    }


    public int getNumberSchool() {
        return numberSchool;
    }

    public void setNumberSchool(int numberSchool) {
        this.numberSchool = numberSchool;
    }

    public String getAdressSchool() {
        return adressSchool;
    }

    public void setAdressSchool(String adressSchool) {
        this.adressSchool = adressSchool;
    }

    public int getPhoneSchool() {
        return phoneSchool;
    }

    public void setPhoneSchool(int phoneSchool) {
        this.phoneSchool = phoneSchool;
    }

    public ClassRoom[] getSchoolListOfClass() {
        return schoolListOfClass;
    }

    public void setSchoolListOfClass(ClassRoom[] schoolListOfClass) {
        this.schoolListOfClass = schoolListOfClass;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}
