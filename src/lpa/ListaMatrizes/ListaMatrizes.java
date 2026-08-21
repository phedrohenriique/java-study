package ListaMatrizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListaMatrizes {

    public static void main(String[] args) {

        // System.out.println("works");
        // Exercicio2(); // static function shall recieve static methods
        // Exercicio3();
        // Exercicio4();

        int[][] matrixA = { // A3x2
                { 12, 1 },
                { 1, 1 },
                { 1, 1 }
        };
        int[][] matrixB = { // B2x3
                { 1, 2, 3 },
                { 1, 2, 3 }
        };

        // result c
        // int[][] matrixC = {
        // { 6, 6, 6 },
        // { 6, 6, 6 },
        // { 6, 6, 6 }
        // };

        // Exercicio5(matrixA, matrixB);

        Desafio();

    }

    public static void Exercicio2() {

        // int[][] matrix = new int[5][2];

        int[][] matrix = {
                { 1, 9 },
                { 6, 7 },
                { 5, 6 },
                { 1, 4 },
                { 3, 1 }
        };

        int total = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                total = total * matrix[i][j];
            }
        }

        System.out.println(total);
    };

    public static boolean Exercicio3() {

        System.err.println("Choose a number to check if it is in the matrix \n");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] matrix = {
                { 1, 9 },
                { 6, 7 },
                { 5, 6 },
                { 1, 4 },
                { 3, 1 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] != num) {
                    System.err.println("Number not Found");
                }

                if (matrix[i][j] == num) {
                    System.out.println("Number found at " + "Row: " + i + " Column: " + j);
                    return true;
                }

            }
        }

        return false;

    }

    public static void Exercicio4() {

        int[][] matrix = {
                { 50, 9, 10, 58 },
                { 6, 7, 20, 18 },
                { 5, 6, 33, 37 }
        };

        int max = matrix[0][0];
        int maxR = 0;
        int maxC = 0;
        int min = matrix[0][0];
        int minR = 0;
        int minC = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxR = i;
                    maxC = j;
                }

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minR = i;
                    minC = j;
                }
            }
        }

        System.out.println("max number is: " + max + " row: " + maxR + " column: " + maxC);
        System.out.println("min number is: " + min + " row: " + minR + " column: " + minC);

    }

    public static void Exercicio5(int[][] m1, int[][] m2) {

        // matrix trespassing can not have optimization
        //

        int rows = m1.length;
        int cols = m2[0].length;

        int[][] m3 = new int[rows][cols];

        // List<Integer> results = new ArrayList<>();
        // for (Integer r : results) {
        // System.out.println(r);
        // }

        int k = 1;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

            }
        }

    }

    public static void Desafio() {

        int[] v1 = { 1, 2, 25, 29, 32 };
        int[] v2 = { 4, 6, 8, 10, 11 };
        int[] v3 = new int[v1.length + v2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (k <= v3.length - 1) {

            // if (i >= v1.length || j >= v2.length ){
            //     break;
            // }

            if (i > j && i == v1.length && j < v2.length){
                v3[k] = v2[j];
                j++;
                k++;
                continue;
            }

            if (j > i && j == v2.length && i < v1.length){
                v3[k] = v1[i];
                i++;
                k++;
                continue;
            }

            if (v1[i] < v2[j]) {
                v3[k] = v1[i];
                i++;
                k++;
                continue;
            }

            v3[k] = v2[j];
            j++;
            k++;

        }

        for (Integer n : v3) {
            System.out.println(n);
        }

    }

}