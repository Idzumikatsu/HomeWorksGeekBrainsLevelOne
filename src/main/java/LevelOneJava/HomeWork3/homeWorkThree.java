package LevelOneJava.HomeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class homeWorkThree {

    public static void main(String[] args) {
        revertZeroToOne();
        System.out.println();
        changeValueOfElementsInMassiveOneToOneHundred();
        System.out.println();
        doubleElementsThatDivideBySix();
        System.out.println();
        drawDiagonalValuesOfMassiveEqualOne();
        System.out.println();
        printMassiveWithUserValues();
    }

    //the first task
    public static void revertZeroToOne() {
        int[] array = {1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //the second task
    public static void changeValueOfElementsInMassiveOneToOneHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    //the third task
    public static void doubleElementsThatDivideBySix() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //the fourth task
    public static void drawDiagonalValuesOfMassiveEqualOne() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == i) {
                    System.out.print("  " + (array[j][i] = 1));
                } else if (i == ((array.length - j) - 1)) {
                    System.out.print("  " + (array[j][i] = 1));
                } else {
                    System.out.print("  " + array[j][i]);
                }
            }
            System.out.println(" ");
        }
    }

    //the fifth task
    public static void printMassiveWithUserValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int len = scanner.nextInt();
        System.out.println("Введите значение, которым будут заполнены все элементы массива");
        int initialValue = scanner.nextInt();
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        scanner.close();
        System.out.println(Arrays.toString(array));
    }

}

