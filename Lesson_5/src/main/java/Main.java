public class Main {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        int sum;
        try {
            sum = takeArray(array);
            System.out.println(sum);
        } catch(MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        indexOutOfBoundsException();
    }
    public static int takeArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // ЗАДАНИЕ 1
        if(array == null || array.length != 4) {
            throw new MyArraySizeException();
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] == null || array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        // ЗАДАНИЕ 2
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
    // ЗАДАНИЕ 3
    public static void indexOutOfBoundsException() {
        int[] array = new int[3];
        try {
            // Попытка обратиться к 5-му элементу в массиве из 3-х
            array[4] = 36;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException was caught");
        }
    }
}
// Исключение по размеру массива
class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Array size error");
    }
}
// Исключение по приведению данных массива
class MyArrayDataException extends Exception {
    private final int row;
    private final int col;
    public MyArrayDataException(int row, int col) {
        super("Element conversion error in array[" + row + "][" + col + "]");
        this.row = row;
        this.col = col;
    }
    public int getRow() {
        return this.row;
    }
    public int getCol() {
        return this.col;
    }
}