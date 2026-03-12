import java.io.*;
import java.util.Scanner;

// import java.text.DecimalFormat;
// import java.util.Scanner;

// to run this script you need to use the command $ javac filename.java
// a new compiled file will be created and can be used with command $ java filename

class ListaSwitch {
    public static void main(String[] args) {

        // System.out.println("Hello World");
        ExerciseOne();

    }

    public static void ExerciseOne() {

        // 10% desconto funcionario
        // 5% desconto clientes vips
        // output valor total a ser pago
        // 1 - cliente comum , 2 - funcionario, 3 - vip
        // 2 vlores de output

        double total;
        float clientType;

        System.out.println("total amount of the purchase:");
        Scanner sc1 = new Scanner(System.in);
        total = sc1.nextDouble();

        System.out.println("type of the client:");
        Scanner sc2 = new Scanner(System.in);
        clientType = sc2.nextInt();

        if (clientType == 1) {
            total = total;
            System.out.println("the client is common, total is:");
            System.out.printf("%.2f",total);

        }

        if (clientType == 2){
            total = total*0.9;
            System.out.println("The client is a worker, total is:");
            System.out.printf("%.2f",total);
        }

        if (clientType == 3){

            total = total*0.95;
            System.out.println("The client is a vip, total is:");
            System.out.printf("%.2f",total);
        }

    }

    public static void ExerciseTwo(){
        
    }
}
