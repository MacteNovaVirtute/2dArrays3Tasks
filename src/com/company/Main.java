package com.company;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.println("\n1. Принимает двумерный (квадратный) массив интов, возвращает сумму диалогалей");
        sumOfDiagonals(array);

        System.out.println("\n2. Принимает двумерный массив long и двумерный массив булеан, возвращает одномерный массив лонгов который состоит из элементов первого массива. " +
                "По индексам по которым в массиве булеан хранятся значения тру.");
        long[][] twoDimLong = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        boolean[][] twoDimBool = {
                {false, true, false},
                {false, false, true},
                {true, true, false}};
        toOneDimArr(twoDimLong, twoDimBool);

        System.out.println("\n3. Принимает двумерный массив символов - выводит его на экран.");
        char[][] chars = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };

        printArrayChars(chars);


    }


    static void sumOfDiagonals(int[][] array) {
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; ++i) {
            mainDiagonal += array[i][i];
            secondaryDiagonal += array[i][array.length - i - 1];
        }
        System.out.println("\nСумма элементов главной диагонали = " + mainDiagonal);
        System.out.println("\nСумма элементов побочной диагонали = " + secondaryDiagonal);
        System.out.println("\nСумма элементов главной и побочной диагонали = " + (mainDiagonal + secondaryDiagonal));

    }

    static void toOneDimArr(long[][] array, boolean[][] boolArray) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (boolArray[i][j]) {
                    length += 1;
                }
            }
        }
        long[] oneLongArray = new long[length];
        length = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (boolArray[i][j]) {
                    oneLongArray[length] = array[i][j];
                    System.out.print(oneLongArray[length]);
                    length++;
                }
            }
        }


    }

    static void printArrayChars(char[][] chars) {
        for(int i = 0; i < chars.length; i++) {
            for(int j = 0; j < chars.length; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }
}




