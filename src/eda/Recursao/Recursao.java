package eda.Recursao;

public class Recursao {

    public static void main(String[] args) {

        // CalculaMDC(48, 56);

        // int result = Fatorial(5); // result == 120
        // System.out.println(result);

        // String result = decimalToBinary(10);
        // System.out.println(result);

        int result = sumDigits(1111);
        System.out.println(result);

    }; 

    public static int CalculaMDC(int m, int n) {

        if (n == 0) {
            System.out.println(m);
            return m;
        }

        
        return CalculaMDC(n, m % n);
    }

    public static int Fatorial(int x){

        if(x == 0){
            
            return 1;
        }

        return x * Fatorial(x - 1);

    }

    public static String decimalToBinary(int n) {

        if (n < 2) {
            return String.valueOf(n);
        }
    
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static int sumDigits(int n) {

        if (n == 0) {
            return 0;
        }
    
        return (n % 10) + sumDigits(n / 10);
    }

}
