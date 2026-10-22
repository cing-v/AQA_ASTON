// Одна запись в телефонной книге
public class Entry {
    private String name;
    private String number;
    // Конструктор
    public Entry(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
}
