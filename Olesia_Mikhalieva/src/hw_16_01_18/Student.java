package hw_16_01_18;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private int age;
    private String name;
    private String skills;
    private Student[]studMass;
    private int limitStudents=20;

    public Student() {
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student(int age, String name, String skills) {
        this.age = age;
        this.name = name;
        this.skills = skills;
    }

    public int getAge() {
        return age;
    }

    public void setRandomAge() {
        this.age = ThreadLocalRandom.current().nextInt(7, 16 + 1);
    }

    public Student[] getStudMass() {
        return studMass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        if (skills!="ukr"||skills!="eng"){
            System.out.println("There are no classes for you. Please get me your other skills");
        }
        this.skills = skills;
    }

    public void setRandomName(){
            studMass = new Student[limitStudents];
            for (int i = 0; i < limitStudents; i++) {
                int maxQuolityRandomNames = 40;
                Random random = new Random();
                String[] names = new String[15];
                String[] randomNames = new String[maxQuolityRandomNames];
                names[0] = "Ivan";
                names[1] = "Irina";
                names[2] = "Artem";
                names[3] = "Elena";
                names[4] = "Katia";
                names[5] = "Serger";
                names[6] = "Vasia";
                names[7] = "Denis";
                names[8] = "Pasha";
                names[9] = "Sasha";
                names[10] = "Petia";
                names[11] = "Vova";
                names[12] = "Yulia";
                names[13] = "Macksim";
                names[14] = "Alex";
                for (int j = 0; j < maxQuolityRandomNames; j++) {
                    randomNames[j] = names[random.nextInt(names.length)];
                   this.name = randomNames[i];
                }
            }
        }

        public void setRandomSkills(){
            studMass = new Student[60];
            for (int i = 0; i < limitStudents; i++) {
                int maxQuolityRandomSkills = 50;
                Random random = new Random();
                String[] skillsMas = new String[2];
                String[] randomNames = new String[maxQuolityRandomSkills];
                skillsMas[0] = "ukr";
                skillsMas[1] = "eng";
                for (int j = 0; j < maxQuolityRandomSkills; j++) {
                    randomNames[j] = skillsMas[random.nextInt(skillsMas.length)];
                    this.skills = randomNames[i];
                }
            }
        }


    }


