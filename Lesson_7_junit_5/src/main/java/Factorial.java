public final class Factorial {
    // Конструктор запрещает создавать экземпляры (утилитарный класс)
    private Factorial() {
        throw new AssertionError("Do not instantiate");
    }
    // Метод вычисляющий факториал и возвращающий значение
    public static long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Not defined for negative numbers");
        }
        long result = 1;
        while(n > 1) {
            result *= n;
            n--;
        }
        return result;
    }
}