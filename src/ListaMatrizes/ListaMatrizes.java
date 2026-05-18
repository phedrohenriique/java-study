package ListaMatrizes;

import java.util.Scanner;

public class ListaMatrizes {

    public static void main(String[] args) {

        // System.out.println("works");
        // Exercicio2(); // static function shall recieve static methods
        // Exercicio3();
        // Exercicio4()

        int[][] matrixA = {
            {1,1}
        };
        int[][] matrixB = {
            {3,2}
        };

        // int[][] matrixC = MatrixMultiplication(matrixA, matrixB)

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

    // public static int[][] MatrixMultiplication(int[][] m1, int m2[][]) {

    //     // A(mxn) X B(nxp) = C(mxp)

    //     int rowA = m1.length;
    //     int colA = m1[0].length;

    //     int rowB = m2.length;
    //     int colB = m2[0].length;

    //     int[][] matrixC = new int[rowA][colB];

    //     if (m1[0].length != m2.length) {
    //         // check failure
    //         matrixC = new int[1][1];
    //         return matrixC;
    //     }

    //     // check sum logic

    //     for (int ia = 0; ia < m1.length; ia++) {
    //         for (int jb = 0; jb < m1[0].length; jb++) {

    //             matrixC[ia][jb] = 0;
                
    //         }
    //     }

    //     for (int ib = 0; ib < m2.length; ib++) {
    //         for (int jb = 0; jb < m2[0].length; jb++) {


    //         }
    //     }

    //     return matrixC;

    // }

}