package hw_29_04_18.Log_2;


public class Student {

    private int id;
    private String name;
    private String secName;
    private String Thirdname;

    public Student(String name, String secName, String thirdname) {
        this.name = name;
        this.secName = secName;
        Thirdname = thirdname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getThirdname() {
        return Thirdname;
    }

    public void setThirdname(String thirdname) {
        Thirdname = thirdname;
    }
}
