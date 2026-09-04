package poo.Class;

import java.util.Scanner;
import poo.Entities.Rectangle;

public class Class {

    public static int TotalFiction;
    public static int TotalRomance;
    public static int TotalAdventure;
    public static int totalBooksSold;

    public static float TotalBuyers;
    public static float TotalMen;
    public static float TotalWoman;
    public static float totalMenReadRomance;

    public static void main(String[] args) {
        // ClassWork28082026();


    }; // simplified version for JDK 21+

    public static void FrontEnd(){
        
    }

    public static void ClassWork28082026() {

        while (true) {

            System.out.println("Select the options of books");
            System.out.println("Fiction - 1");
            System.out.println("Romance - 2");
            System.out.println("Adventure - 3");
            System.out.println("Stop research - 0");

            Scanner BookTypeSC = new Scanner(System.in);
            int BookType = BookTypeSC.nextInt();

            if (BookType == 0) {
                System.out.println("the most sold book was:");

                if (TotalFiction > TotalAdventure && TotalFiction > TotalRomance) {
                    System.out.println("Fiction");
                }

                if (TotalAdventure > TotalFiction && TotalAdventure > TotalRomance) {
                    System.out.println("Adventure");
                }

                if (TotalRomance > TotalFiction && TotalRomance > TotalAdventure) {
                    System.out.println("Romance");
                }

                System.err.println("the total number of men that read romance books");
                if (TotalMen <= 0) {
                    System.out.println("no men read romance");
                    break;
                }
                double percentageMenReadRomance = (totalMenReadRomance / TotalMen) * 100;
                System.out.println(percentageMenReadRomance + "%");

                break;
            }

            if (BookType == 1) {
                TotalFiction = TotalFiction + 1;
                totalBooksSold++;
            }

            if (BookType == 2) {
                TotalRomance = TotalRomance + 1;
                totalBooksSold++;
            }

            if (BookType == 3) {
                TotalAdventure = TotalAdventure + 1;
                totalBooksSold++;
            }

            System.out.println("Select your gender");
            System.out.println("Male - 1");
            System.out.println("Female - 2");

            Scanner GenderTypeSC = new Scanner(System.in);
            int GenderType = GenderTypeSC.nextInt();

            if (GenderType == 1) {
                TotalMen = TotalMen + 1;
                if (BookType == 2) {
                    totalMenReadRomance++;
                }
            }

            if (GenderType == 2) {
                TotalWoman = TotalWoman + 1;
            }

            TotalBuyers = TotalBuyers + 1;

        }
    }
}
