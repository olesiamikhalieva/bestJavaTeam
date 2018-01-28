package hw_16_01_18;


public class Main {
    private static int limitStudents = 100;
    private static Student[] studMass;
    private static int countStudent = 0;
    private static Student student;
    private static ClassRoom[] classRoomMass;
    private static ClassRoom classRoom;
    private static Adress adress;


    public static void main(String[] args) {

        School school = new School();
        System.out.println("Classroom at school default:");
        printClassSchoolDefault(school);

        System.out.println();

        System.out.println("Classword if classCount=2 at newSchool: ");
        School newSchool = new School(2);
        newSchool.setClassWordClassDirectionAuto();

        System.out.println();

        adress = new Adress("Dnepropetrovsk region", "Dnepr", "Gagarina", 7423323);
        newSchool.setAdress(adress);
        printAdressOfSchool(newSchool);

        System.out.println("Only city of school:");
        printOnlyCityOfSchool(newSchool);

        System.out.println();

        System.out.println("Quality of classes at school: "+newSchool.getClassCount());
        classRoom = new ClassRoom();
        newSchool.addClassToSchool(classRoom);
        System.out.println("Quality of classes at school after addition 1 class: " +newSchool.getClassCount());

        newSchool.printClassesAtSchool();

        System.out.println();

        Student student = new Student(15,"Vova","ukr");
        newSchool.getClassRoom(classRoom).addStudentToClass(student,classRoom);
        classRoom.printAllStudentAtClass();

        System.out.println();

        System.out.println("30 students:");
        print30Students(newSchool.add30Students());

        System.out.println();
        newSchool.distrStudents();
        newSchool.printClasses();


    }


    private static void printAdressOfSchool(School school){
        System.out.println("Adress of school:");
        System.out.println(school.getAdress().getRegion()+", "+school.getAdress().getCity()+ ", "+school.getAdress().getStreet()+", "+school.getAdress().getPhone());
    }

    private static void printOnlyCityOfSchool(School school){
        System.out.println(school.getAdress().getCity());
    }

    private static void printClassSchoolDefault(School school) {
        for (ClassRoom classRoom : school.getSchoolListOfClass()) {
            System.out.println(classRoom.getClassWord() + " " + classRoom.getClassRoomDirection());
        }
    }

    private static void print30Students(Student [] studMass){
        for (Student stud: studMass){
            System.out.println(stud.getName()+" "+stud.getAge()+" "+stud.getSkills());
        }
    }








}









