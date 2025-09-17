import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number");
        int n =  scn.nextInt();

       // printDecreasing(n);
       int f = factorial(n);
       System.out.println("the factorial of" + n +  "is" + f);

        scn.close();
    }

    public static void printDecreasing(int n){
        if(n==0){
            System.out.println("recrusion stopped finally...............");
            return;
        }

        System.out.println(n);

        printDecreasing(n-1);
    }

    public static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n=1);
    }
        
    }

    

