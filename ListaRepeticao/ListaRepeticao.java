package ListaRepeticao;

import java.util.Scanner;

public class ListaRepeticao {

    public static void main(String[] args) {

        // exercise3();
        // exercise5();
        // exercise9();
        exercise10();
    }

    public static void exercise1() {

    }

    public static void exercise2() {

    }

    public static void exercise3() {

        // print the quantity of odd and even numbers
        // use -1 to finish

        int countEven = 0; // java expects default value
        int countOdd = 0;

        while (true) {

            System.out.println("choose a number or -1 to finish the counting");
            Scanner sc = new Scanner(System.in);
            float num = sc.nextFloat();

            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                countEven += 1;
            }
            if (num % 2 != 0) {
                countOdd += 1;
            }
        }
        System.out.println("the quantity of even numbers:" + countEven);
        System.out.println("the quantity of odd numbers:" + countOdd);
    }

    public static void exercise4() {

    }

    public static void exercise5() {
        // write a program that gives back a fatoria of a number
        System.err.println("choose a number and calculate factorial");

        int num;
        int result;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        result = num;

        while (num > 1) {
            num = num - 1;
            result = result * num;
        }
        System.err.println("the total is: " + result);
    }

    public static void exercise6() {

    }

    public static void exercise7() {

    }

    public static void exercise8() {

    }

    public static void exercise9() {

        // check prime number
        // previous numbers might not return mod 0,
        // input 6 --> 6%3 = 0, 6%2 = 0, 6%6 = 0, 6%1 = 0
        // input 5 --> 5%5 = 0 and 5%1 = 0 only

        int num;
        int temp;
        int count = 0;

        System.out.println("choose a number to check if it is prime");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;

        while (num > 0 && temp > 0) {
            if (num % temp == 0) {
                count += 1;
            }
            temp -= 1;
        }
        if (count == 2) {
            System.out.println("number is prime: ");
        }
        if (count != 2) {
            System.out.println("number is not prime: ");
        }

    }

    public static void exercise10() {

        // create a form that stores the variables
        // age, sex and code
        // services 1 compras, 2 servicos, 3 lazer, 4 alimentacao

        int age;
        char sex;
        int objective;

        float qtyServices;
        float qtyObjectives;
        float totalMen;
        float totalWomen;

        while (true) {

            System.out.println("choose your age");
            Scanner sc1 = new Scanner(System.in);
            age = sc1.nextInt();

            System.out.println("choose your sex m-male, f-female");
            Scanner sc2 = new Scanner(System.in);
            sex = sc2.next().charAt(0);

            System.out.println(
                    "choose numbers for your objectve from 1-compras, 2-servicos, 3-lazer, 4-alimentacao, 5-end");
            Scanner sc3 = new Scanner(System.in);
            objective = sc3.nextInt();

            if (objective == 5){
                break;
            }

            if (sex == 'm'){
                totalMen += 1;
            }

            if (sex == 'f'){
                totalWomen += 1;
            }

        }

    }

}
