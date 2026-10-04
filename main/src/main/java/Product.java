class Product {
    private String name;
    private String productionDate;
    private String producer;
    private String originCountry;
    private double price;
    private boolean isReserved;

    // Конструктор по умолчанию
    public Product() { }
    // Параметризированный конструктор
    public Product(String name, String productionDate, String producer, String originCountry, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.producer = producer;
        this.originCountry = originCountry;
        this.price = price;
        this.isReserved = isReserved;
    }
    // Метод, который выводит информацию об объекте в консоль
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.productionDate);
        System.out.println(this.producer);
        System.out.println(this.originCountry);
        System.out.println(this.price);
        System.out.println(this.isReserved);
    }
}