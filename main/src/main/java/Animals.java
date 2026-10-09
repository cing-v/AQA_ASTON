class Animals {
    protected String name;
    private static int animalCount = 0;
    // Конструктор
    public Animals(String name) {
        this.name = name;
        animalCount++;
    }
    // Геттер для счётчика животных
    public int getAnimalCount() {
        return animalCount;
    }
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров");
    }
    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " метров");
    }
}
// класс Кот
class Cat extends Animals {
    private static int catCount = 0;
    private boolean isFed;
    // Конструктор
    public Cat(String name) {
        super(name);
        this.isFed = false;
        catCount++;
    }
    // Геттер для счётчика котов
    public int getCatCount() {
        return catCount;
    }
    // Геттер для сытости кота
    public boolean getIsFed() {
        return this.isFed;
    }
    @Override
    public void run(int distance) {
        if(distance > 200) {
            System.out.println("Кот может пробежать не больше 200 метров");
        } else {
            //System.out.println(name + " пробежал " + distance + " метров");
            super.run(distance);
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }
    // Метод поесть из миски
    public void eatFromBowl(Bowl bowl, int amount) {
        if (bowl.eat(amount)) {
            this.isFed = true;
        }
    }
}
// класс Собака
class Dog extends Animals {
    private static int dogCount = 0;

    // Конструктор
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    // Геттер для счётчика собак
    public int getDogCount() {
        return dogCount;
    }
    @Override
    public void run(int distance) {
        if(distance > 500) {
            System.out.println("Собака может пробежать не больше 500 метров");
        } else {
            //System.out.println(name + " пробежал " + distance + " метров");
            super.run(distance);
        }
    }
    @Override
    public void swim(int distance) {
        if(distance > 10) {
            System.out.println("Собака может проплыть не больше 10 метров");
        } else {
            //System.out.println(name + " проплыл " + distance + " метров");
            super.swim(distance);
        }
    }
}
// класс Миска
class Bowl {
    private int foodAmount;
   // Конструктор
    public Bowl(int initialFood) {
        if (initialFood < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = initialFood;
        }
    }
    // Метод для кота
    public boolean eat(int amount) {
        if (amount > foodAmount) {
            return false;
        }
        foodAmount -= amount;
        return true;
    }
    // Метод для добавления еды
    public void addFood(int amount) {
        foodAmount += amount;
    }
}

