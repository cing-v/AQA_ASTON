import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // Вызов метода Задание 1
    System.out.println("\u001B[33m" + "Exersice 1" + "\u001B[0m");
    printThreeWords();
    System.out.println();

    // Вызов метода Задание 2
    System.out.println("\u001B[33m" + "Exersice 2" + "\u001B[0m");
    checkSumSign();
    System.out.println();

    // Вызов метода Задание 3
    System.out.println("\u001B[33m" + "Exersice 3" + "\u001B[0m");
    printColor();
    System.out.println();

    
    // Вызов метода Задание 4
    System.out.println("\u001B[33m" + "Exersice 4" + "\u001B[0m");
    compareNumbers();
    System.out.println();

    // Вызов метода Задание 5
    System.out.println("\u001B[33m" + "Exersice 5" + "\u001B[0m");
    boolean resultFive = checkSumInput(random.nextInt(), random.nextInt());
    System.out.println(resultFive);
    System.out.println();

    // Вызов метода Задание 6
    System.out.println("\u001B[33m" + "Exersice 6" + "\u001B[0m");
    checkNumSign(random.nextInt());
    System.out.println();

    // Вызов метода Задание 7
    System.out.println("\u001B[33m" + "Exersice 7" + "\u001B[0m");
    boolean resultSeven = checkNumNegative(random.nextInt());
    System.out.println();

    // Вызов метода Задание 8
    System.out.println("\u001B[33m" + "Exersice 8" + "\u001B[0m");
    printString("Some string for example", random.nextInt(5) + 1);
    System.out.println();

    // Вызов метода Задание 9
    System.out.println("\u001B[33m" + "Exersice 9" + "\u001B[0m");
    boolean resultNine = isLeapYear(21);
    System.out.println(resultNine);
    System.out.println();

    // Вызов метода Задание 10
    System.out.println("\u001B[33m" + "Exersice 10" + "\u001B[0m");
     binaryArray();
    System.out.println();

    // Вызов метода Задание 11
    System.out.println("\u001B[33m" + "Exersice 11" + "\u001B[0m");
    printArray();
    System.out.println();

    // Вызов метода Задание 12
    System.out.println("\u001B[33m" + "Exersice 12" + "\u001B[0m");
    changeArray();
    System.out.println();

    // Вызов метода Задание 13
    System.out.println("\u001B[33m" + "Exersice 13" + "\u001B[0m");
    squareArray();
    System.out.println();

    // Вызов метода Задание 14
    System.out.println("\u001B[33m" + "Exersice 14" + "\u001B[0m");
    int[] array = returnArray(7, 42);

    for(int i = 0; i < 7; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  private static Random random = new Random();

  // Задание 1
  private static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
  }

  // Задание 2
  private static void checkSumSign() {
    
    int a = random.nextInt();
    int b = random.nextInt();
    
    int sum = a + b;
    
    if(sum >= 0) {
      System.out.println("Сумма положительная");
    } else {
      System.out.println("Сумма отрицательная");
    }
  }

  // Задание 3
  private static void printColor() {
    int value = random.nextInt();

    if(value <= 0) {
      System.out.println("Красный");
    } else if(value > 0 && value <= 100) {
      System.out.println("Желтый");
    } else {
      System.out.println("Зеленый");
    }
  }

  // Задание 4
  private static void compareNumbers() {

    int a = random.nextInt();
    int b = random.nextInt();

    if(a >= b) {
      System.out.println("a >= b");
    } else {
      System.out.println("a < b");
    }
  }

  // Задание 5
  private static boolean checkSumInput(int a, int b) {
    int sum = a + b;
    boolean result;

    if(sum >= 10 && sum <= 20) {
      result = true;
    } else {
      result = false;
    }

    return result;
  }

  // Задание 6
  private static void checkNumSign(int n) {
    if(n >= 0) {
      System.out.println("Число положительное");
    } else {
      System.out.println("Число отрицательное");
    }
  }

  // Задание 7
  private static boolean checkNumNegative(int n) {
    boolean result;

    if(n >= 0) {
      result = false;
    } else {
      result = true;
    }

    return result;
  }

  // Задание 8
  private static void printString(String str, int n) {
    while(n != 0) {
      System.out.println(str);
      n--;
    }
  }

  // Задание 9
  private static boolean isLeapYear(int num) {
    boolean result;

    if(num % 4 != 0) {
      result = false;
    } else if(num % 100 == 0 && num % 400 != 0) {
      result = false;
    } else {
      result = true;
    }

    return result;
  }

  // Задание 10
  private static void binaryArray() {
    byte[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

    // Печать массива до изменений
    System.out.print("Массив до:    ");
    for(byte b : array) {
      System.out.print(b + " ");
    }
    System.out.println();

    for(int i = 0; i < array.length; i++) {
      if(array[i] == 0) {
        array[i] = 1;
      } else {
        array[i] = 0;
      }
    }

    // Печать массива после изменений
    System.out.print("Массив после: ");
    for(byte b : array) {
      System.out.print(b + " ");
    }
    System.out.println();
  }

  // Задание 11
  private static void printArray() {
    int[] array = new int[100];

    for(int i = 0; i < 100; i++) {
      array[i] = i + 1;
    }

    for(int n : array) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  // Задание 12
  private static void changeArray() {
    int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    // Печать массива до изменений
    System.out.print("Массив до:    ");
    for(int n : array) {
      System.out.printf("%2d ", n);
    }
    System.out.println();

    for(int i = 0; i < array.length; i++) {
      if(array[i] < 6) {
        array[i] = array[i] * 2;
      }
    }

    // Печать массива после изменений
    System.out.print("Массив после: ");
    for(int n : array) {
      System.out.printf("%2d ", n);
    }
    System.out.println();
  }

  // Задание 13
  private static void squareArray() {
    int[][] array = new int[5][5];

    // Заполняем массив по диагонали
    for(int i = 0; i < 5; i++) {
      array[i][i] = 1;
    }

    // Печатаем массив
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Задание 14
  private static int[] returnArray(int len, int initialValue) {
    int[] array = new int[len];

    for(int i = 0; i < len; i++) {
      array[i] = initialValue;
    }

    return array;
  }

}