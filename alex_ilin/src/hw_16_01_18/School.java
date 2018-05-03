package hw_16_01_18;


// Todo Что с импортами?
// Todo где методы которые должны быть у школы?
public class School {


    private int schoolNumber;
    private String schoolAdress;
    private int schoolPhone;
    private String[] listOfSchoolClasses;
    private int classCount = 4;
    private hw_16_01_18.ClassRoom[] arrayOfClasses;
    private int countOfStudnets;
    private String classChar;
    private hw_16_01_18.ClassRoom className;



    public School() {
        arrayOfClasses = new hw_16_01_18.ClassRoom[classCount];

        for(int i = 0; i<classCount;i++){

            className = new ClassRoom(classChar, countOfStudnets);
            arrayOfClasses[i] = className;
        }


    }

    public ClassRoom[] getArrayOfClasses() {
        return arrayOfClasses;
    }

    public void setArrayOfClasses(ClassRoom[] arrayOfClasses) {
        this.arrayOfClasses = arrayOfClasses;
    }

    public int getCountOfStudnets() {
        return countOfStudnets;
    }

    public void setCountOfStudnets(int countOfStudnets) {
        this.countOfStudnets = countOfStudnets;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getSchoolAdress() {
        return schoolAdress;
    }

    public void setSchoolAdress(String schoolAdress) {
        this.schoolAdress = schoolAdress;
    }

    public int getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(int schoolPhone) {
        this.schoolPhone = schoolPhone;
    }

    public String[] getListOfSchoolClasses() {
        return listOfSchoolClasses;
    }

    public void setListOfSchoolClasses(String[] listOfSchoolClasses) {
        this.listOfSchoolClasses = listOfSchoolClasses;
    }

    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    public String getClassChar() {
        return classChar;
    }

    public void setClassChar(String classChar) {
        this.classChar = classChar;
    }

    //    public void createNewClasses(String classWord, int classLimit) {//сохдаем новые классы
//          for(int i = 0; i<classCount; i++){
//       ClassRoom classic = new ClassRoom(classWord, classLimit);
//   }
//
//}

}
