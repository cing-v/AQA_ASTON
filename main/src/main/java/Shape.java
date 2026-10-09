public interface Shape {
    // Вычисление периметра
    default double calculatePerimeter() {
        throw new UnsupportedOperationException();
    }
    // Вычисление площади
    default double calculateArea() {
        throw new UnsupportedOperationException();
    }
}