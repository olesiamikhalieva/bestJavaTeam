package hw_25_04_18.StudentProject.src.main.java;

import java.util.ArrayList;
/*

Написать простую cтуд программу:
Есть пустой список студентов.
Реализовать ф-ционал добавления, удаления, редактирования, чтения данного списка.
Использовать мавен. Протестировать методы с помощью junit.
Разобратся как запускать отдельно все тесты через мавен+ из терминала.

 */
public class StudentsList {

    private ArrayList<Student> arrayListStudentsLists = new ArrayList<Student>();


    public ArrayList<Student> getArrayListStudentsLists() {
        return arrayListStudentsLists;
    }

    public void addStudent(Student student){
       arrayListStudentsLists.add(student);
   }

   public void deleteStudent(Student student){
       arrayListStudentsLists.remove(student);
   }

   public void changeStudent(Student student1, Student student2){
       arrayListStudentsLists.remove(student1);
       arrayListStudentsLists.add(student2);
   }

   public void printStudents (){
       for (Student studentsList : arrayListStudentsLists) {
           System.out.println(studentsList);
       }
   }

}
