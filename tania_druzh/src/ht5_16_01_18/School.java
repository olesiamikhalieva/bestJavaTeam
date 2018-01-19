package ht5_16_01_18;

public class School {
    private int number;
    private Adres adres;
    private ClassRoom[] classList;

    public School() {
        ClassRoom [] classes = new ClassRoom[4];
        classes[0] = new ClassRoom("A","ukr");
        classes[1] = new ClassRoom("B","ukr");
        classes[2] = new ClassRoom("D","eng");
        classes[3] = new ClassRoom("Z","eng");

    }

    public School(int number, Adres adres, ClassRoom[] classList) {
        this.number = number;
        this.adres = adres;
        this.classList = classList;
    }

    public void createSchool(String [] classesList){
        ClassRoom [] classes = new ClassRoom[classesList.length];
        for (int i = 0; i < classesList.length; i++){
            classes[i] = new ClassRoom(classesList[i]);
        }

    }

    public void addClasses(ClassRoom classObj){
        for (int i = 0; i < classList.length; i++){
            if (classList == null){
                classList[i] = classObj;
            }
        }
    }

    public School(int number, Adres adres, ClassRoom classRoom) {
        this.number = number;
        this.adres = adres;
        for (int i = 0; i < classList.length; i++){
            if (classList[i] == null) {
                classList[i] = classRoom;
            }
        }

    }

    /*показывающий сколько и какие классы есть в школе*/
    public void printClassList(){
        System.out.println("There are " + classList.length + " classes in school.");
        for (ClassRoom classR : classList) {
            System.out.println("Class " + classR.getClassWord() + " with limit " + classR.getClassLimit() + " and language" + classR.getLang());

        }
    }

    /*сколько украино язычных, сколько англоязычных классов*/
    public void colClassesByLang(){
        int engCount = 0;
        int ukrCount = 0;
        for (ClassRoom classR : classList) {
            if (classR.getLang() == "eng") {
                engCount ++;
            }
            else if (classR.getLang() == "ukr"){
                ukrCount ++;
            }
        }

        System.out.println("There are " + engCount + " english classes and " + ukrCount + " ukrainian.");
    }

    /*сколько студентов в каждом классе*/
    public void colStusEachClass()
    {
        for (ClassRoom classRoom : classList) {
            System.out.println("Class " + classRoom.getClassWord() + " has " + classRoom.getClassCount());
        }
    }

    /*сколько всего студентов учится в школе*/
    public void colSchoolStud()
    {
        int col = 0;
        for (ClassRoom classRoom : classList) {
            col = col + classRoom.getClassCount();
        }
        System.out.println("School " + number + " has " + col + " students.");
    }

    /**/
}
