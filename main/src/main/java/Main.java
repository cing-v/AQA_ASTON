public class Main {
    public static void main(String[] args) {
        Product product = new Product("Pen", "01.10.2026", "Shtabillo",
                 "Russia", 56.23, true);
        product.printInfo();

        // ЗАДАНИЕ 2

        // Объявляем массив объектов
        Product[] productsArray = new Product[5];
        // Задаем объект для каждой ячейки массива
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Iphone 16 Pro", "12.08.2025",
                "Apple Corp.", "USA", 7599, false);
        productsArray[2] = new Product("Xiaomi Note 12", "21.05.2025",
                "Xiaomi Corp.", "China", 6897, true);
        productsArray[3] = new Product("Redmi 9 mini", "11.07.2025",
                "Xiaomi Corp.", "China", 4999, false);
        productsArray[4] = new Product("Huawei Pura 90", "01.02.2026",
                "Huawei Corp.", "China", 5599, true);
    }
}
