
// to run with less boilerplate code use command
// $ java --enable-preview folder/file.java
// only 1 public class per file is the best java structure

package poo.Calculator;

// import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) { // simplified version for JDK 21+
       while (true) {

        System.out.println("choose first number");

        Scanner sc1 = new Scanner(System.in);
        float n1 = sc1.nextFloat();

        System.out.println("choose operation");
        System.out.println("1 == +");
        System.out.println("2 == -");
        System.out.println("3 == *");
        System.out.println("4 == /");

        Scanner op = new Scanner(System.in);
        int operation = op.nextInt();

        System.out.println(" choose a second number");

        Scanner sc2 = new Scanner(System.in);
        float n2 = sc2.nextFloat();

        if (operation == 1){
            float result = n1 + n2;
            System.out.println(result);
        }

        if (operation == 2){
            float result = n1 - n2;
            System.out.println(result);
        }

        if (operation == 3){
            float result = n1 * n2;
            System.out.println(result);
        }

        if (operation == 4){
            float result = n1 /  n2;
            System.out.println(result);
        }

        System.out.println(" wanna keep calculating ? y or n");

        Scanner k = new Scanner(System.in);
        char keep = k.next().charAt(0); 

        if (keep == 'n'){
            break;
        }

       }
        

        

        

    }

}