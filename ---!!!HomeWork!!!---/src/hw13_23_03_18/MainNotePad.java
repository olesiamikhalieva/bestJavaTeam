package hw13_23_03_18;

public class MainNotePad {
    public static void main(String[] args) {
        NotePad notePad = new NotePad();

        for (int i = 0; i < 10; i++) {
            notePad.addEntry(new Entry("Имя"+i,"Фамилия"+i,"Отчество"+i,"+777"+i+"7777777"+i,"Яворницкого"+i,"03.08.0"+i,"Работа"+i,"2"+i,"Муж"+i,"Украина"+i));
        }

        System.out.println("Весь блокнот: \n" + notePad);

        notePad.deleteEntry(5);

        System.out.println("Блокнот после удаления 5 записи: \n" + notePad);

        notePad.editEntry(7).setAddress("Гагарина");

        System.out.println("Поменял адресс: \n" + notePad.getEntries().get(7));

        notePad.editEntry(1).setEntry(new Entry("Вася","Пупкин","Семенович","+380687898654","Кряква 44","01.01.01","Предприниматель","25","Мужик","Украина"));

        System.out.println("Изменили 1 запись: \n" + notePad);
    }
}
