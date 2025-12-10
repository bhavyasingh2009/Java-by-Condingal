

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number of characters");

        int n = Scn.nextInt();

        System.out.println("enter the string");
        Scn.nextLine();

        String original = Scn.nextLine();

        System.out.println("original string : " + original);

        String reverse = new StringBuilder(original).reverse().toString();

        System.out.println("reverse string : " + reverse);

        System.out.println("concatenated string : " + original + "-->" + reverse);

    }
    
}
