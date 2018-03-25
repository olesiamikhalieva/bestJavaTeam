package hw_24_03_18.note;

public class Runner {
    private static Note note = new Note();

    public static void main(String[] args) {
        Person person = new Person("Sonya", 348967);
        Person person1 = new Person("Vasya", 345675);
        Person person2 = new Person("Sergey", 145967);
        person.setAdditionalInformation("Dnepr", "01.10.88", "Apple", 24, "Ukraine", "female");
        System.out.println("Add person:");
        note.addPerson(person);
        note.addPerson(person1);
        note.addPerson(person2);
        note.show();
        System.out.println();
        System.out.println("Delete person:");
        note.delete(person);
        note.show();
        System.out.println();
        System.out.println("Edit information(phone Sergey)");
        note.editMainInformation(person2, null, 888888);
        note.show();

    }
}
