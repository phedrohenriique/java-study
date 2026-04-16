import java.io.*;
import java.util.Scanner;

// to run this script you need to use the command $ javac filename.java
// a new compiled file will be created and can be used with command $ java filename


class HelloWorld {
    public static void main (String[] args) {

        // printName("Hello World");
        // printIteration();
        printInput();

    }

    public static void printName(String name){

        System.out.println(name);

    }

    public static void printIteration() {

        for(int i = 0; i<11 ; i++){
            System.out.println(i);
        }
    }

    public static void printInput(){

        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        System.out.println("number : " + Integer.toString(i));

    }
}