public final class Compare {
    // Конструктор запрещает создавать экземпляры (утилитарный класс)
    private Compare() {
        throw new AssertionError("Do not instantiate");
    }
    // Метод сравнивающий числа
    public static void num(int a, int b) {
        // Проверяем на равенство
        if(a == b) {
            System.out.println("Equal");
            return;
        }
        // Сравниваем числа
        if(a > b) {
            System.out.println("Greater");
        } else {
            System.out.println("Less");
        }
    }
}
