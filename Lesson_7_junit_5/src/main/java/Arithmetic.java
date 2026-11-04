public final class Arithmetic {
    // Конструктор запрещает создавать экземпляры (утилитарный класс)
    private Arithmetic() {
        throw new AssertionError("Do not instantiate");
    }
    // Метод вычисляющий сумму
    public static int sum(int a, int b) {
        return a + b;
    }
    // Метод вычисляющий разность
    public static int min(int a, int b) {
        return a - b;
    }
    // Метод вычисляющий произведение
    public static int mult(int a, int b) {
        return a * b;
    }
    // Метод вычисляющий частное
    public static int div(int a, int b) {
        return a / b;
    }
}
