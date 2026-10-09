public class Main {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1
        // создаём котов
        Cat[] catArray = new Cat[4];
        catArray[0] = new Cat("Барсик");
        catArray[1] = new Cat("Мурзик");
        catArray[2] = new Cat("Снежок");
        catArray[3] = new Cat("Пушок");
        // создаём миску
        Bowl bowl = new Bowl(100);
        // кормим котов из миски
        catArray[0].eatFromBowl(bowl, 10);
        catArray[1].eatFromBowl(bowl, 50);
        catArray[2].eatFromBowl(bowl, 40);
        catArray[3].eatFromBowl(bowl, 20);
        // выводим информацию о сытости котов в консоль
        System.out.println(catArray[0].getIsFed());
        System.out.println(catArray[1].getIsFed());
        System.out.println(catArray[2].getIsFed());
        System.out.println(catArray[3].getIsFed());

        // ЗАДАНИЕ 2
        Circle circle = new Circle(7.0, "Red", "Green");
        Triangle triangle = new Triangle(3.0, 5.6, 3.7, "Green", "Grey");
        Rectangle rectangle = new Rectangle(24.0, 12.5, "Black", "Blue");
        // Печатаем данные Круг
        System.out.println("КРУГ:");
        System.out.println("Периметр - " + circle.calculatePerimeter());
        System.out.println("Площадь - " + circle.calculateArea());
        System.out.println("Цвет фона - " + circle.getFillColor());
        System.out.println("Цвет границ - " + circle.getBorderColor());
        // Печатаем данные Треугольник
        System.out.println("ТРЕУГОЛЬНИК:");
        System.out.println("Периметр - " + triangle.calculatePerimeter());
        System.out.println("Площадь - " + triangle.calculateArea());
        System.out.println("Цвет фона - " + triangle.getFillColor());
        System.out.println("Цвет границ - " + triangle.getBorderColor());
        // Печатаем данные Прямоугольник
        System.out.println("ПРЯМОУГОЛЬНИК:");
        System.out.println("Периметр - " + rectangle.calculatePerimeter());
        System.out.println("Площадь - " + rectangle.calculateArea());
        System.out.println("Цвет фона - " + rectangle.getFillColor());
        System.out.println("Цвет границ - " + rectangle.getBorderColor());
    }
}
