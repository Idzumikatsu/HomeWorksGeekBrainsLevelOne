package LevelTwoJava.HomeWork2;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String[][] array = new String[][]{{"7", "8", "4", "7" }, {"2", "8", "4", "3"}, {"5", "t", "3", "4" }, {"5", "4", "3", "4" }};
        checkArrayIndex(array);
        convertToIntAndCalcArraySum(array);
    }

    private static void checkArrayIndex(String[][] array) {
        int outside = array.length;
        for (int j = 0; j < array.length; j++) {
           int inside = array[j].length;
           indexChecker(inside, outside);
       }
   }

   private static void indexChecker(int inside, int outside) {
       if (outside != 4 || inside != 4) {
           try {
               throw new MyArraySizeException();
           } catch (MyArraySizeException e) {
                System.out.println("Ошибка размера массива! Программа принимает на вход двумерный массив только с размерностью [4][4]. Описание ошибки: " + Arrays.toString(e.getStackTrace()));
                System.exit(1);
            }
        }
    }

    private static void convertToIntAndCalcArraySum(String[][] array) {
        int countInside = 0, countOutside = 0;
        try {
            int number = 0, sum = 0;
            for (int i = 0; i < array.length; i++) {
                countOutside++;
                countInside = 0;
                for (int j = 0; j < array[0].length; j++) {
                    countInside++;
                    number = Integer.parseInt(array[i][j]);
                    sum = sum + number;
                }
            }
            System.out.println(sum);
        } catch (RuntimeException e) {
            System.out.println("Ячейка массива [" + countOutside + ", " + countInside + "] не может быть преобразована в INT, возникла ошибка: " + Arrays.toString(e.getStackTrace()));
        }
    }
}