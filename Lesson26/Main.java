package Lesson26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        int xpn = power(x, n);

        System.out.println(xpn);
        scn.close();
    }

    public static int power(int x, int n){
        if (n==0){
            return 1;
        }
        int xpn2 = power(x, n/2);
        int xn = xpn2*xpn2;
        if(n%2 == 0){
            xn = xn*x;
        }
        return xn;
    }

    
    
}
