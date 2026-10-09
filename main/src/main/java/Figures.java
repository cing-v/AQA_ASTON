class Figures implements Shape {
    protected String fillColor;
    protected String borderColor;
    // Конструктор
    public Figures(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Геттеры
    public String getFillColor() {
        return this.fillColor;
    }
    public String getBorderColor() {
        return this.borderColor;
    }
}

class Circle extends Figures {
    private double radius;
    // Конструктор
    public Circle(double radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }
    // Вычисление периметра Круга
    @Override
    public double calculatePerimeter() {
        return 2.0 * Math.PI * this.radius;
    }
    // Вычисление площади Круга
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class Triangle extends Figures {
    private double sideA;
    private double sideB;
    private double sideC;
    // Конструктор
    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    // Вычисление периметра Треугольника
    @Override
    public double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
    // Вычисление площади Треугольника(по формуле Герона)
    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.sideA) * (halfPerimeter - this.sideB) * (halfPerimeter - this.sideC));
    }
}

class Rectangle extends Figures {
    private double sideA;
    private double sideB;
    // Конструктор
    public Rectangle(double sideA, double sideB, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    // Вычисление периметра Прямоугольника
    @Override
    public double calculatePerimeter() {
        return 2.0 * (this.sideA + this.sideB);
    }
    // Вычисление площади Прямоугольника
    @Override
    public double calculateArea() {
        return this.sideA * this.sideB;
    }
}
