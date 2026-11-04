public final class Triangle {
    // Конструктор запрещает создавать экземпляры (утилитарный класс)
    private Triangle() {
        throw new AssertionError("Do not instantiate");
    }
    // Метод вычисляющий площадь треугольника
    public static double calculate(double a, double b, double c) {
        // Проверяем что стороны не нулевые/отрицательные
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("A side of a triangle cannot be less than or equal to zero");
        }
        // Проверяем что стороны действительно составляют треугольник
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("This is not a triangle");
        }
        // Вычисляем полупериметр
        double p = (a + b +c) / 2.0;
        // Вычисляем площадь треугольника по трём сторонам
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s;
    }
}
