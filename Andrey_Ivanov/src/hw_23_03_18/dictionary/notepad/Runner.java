package hw_23_03_18.dictionary.notepad;
import java.util.HashMap;
import java.util.Map;

public class Runner {

public static Map<Integer,Person>notepad=new HashMap<>();

    public static void main(String[] args) {

        createNotepad();//создание блокнота и вывод записей
        System.out.println();
        deleteRecord(3);//удаление записи по ключу и вывод записей после удаления


    }

    public static void createNotepad() {
        Person person1 = new Person("Vova", "123-456-789", 38, "male", "03.02.1980", "ATB");
        person1.adres = new Adres("Ukraine", "Dnepr", "Kosiora");

        Person person2 = new Person("Dima", "456-765-768", 24, "male", "07.09.1994", "FGG");
        person2.adres = new Adres("Germany", "Gerta", "Blyuhera");

        Person person3 = new Person("Vera", "345-765-444", 14, "female", "03.02.2004", "ATB");
        person3.adres = new Adres("USA", "Texas", "Korn");

        notepad.put(1, person1);
        notepad.put(2,person2);
        notepad.put(3,person3);

        System.out.println("Вывод всех записей в блокноте:");
        notepad.forEach((K, V) -> System.out.println(K+"-"+V.toString()));
    }

    public static void deleteRecord(int key){
        notepad.remove(key);
        System.out.println("Выввод записей после удаления:");
        notepad.forEach((K, V) -> System.out.println(K+"-"+V.toString()));
    }
}
