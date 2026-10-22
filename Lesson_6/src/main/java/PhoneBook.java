import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Entry> entries;
    // Конструктор
    public PhoneBook() {
        this.entries = new ArrayList<>();
    }
    // Добавить запись в справочник
    public void add(String name, String number) {
        entries.add(new Entry(name, number));
    }
    // Печатаем номера телефонов по заданной фамилии
    public void get(String name) {
        for (Entry e : entries) {
            if (e.getName().equals(name)) {
                System.out.println(name + " - " + e.getNumber());
            }
        }
    }
}
