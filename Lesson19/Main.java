package Lesson19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //below is the array having a name yoyo of type int of size 4
        int[] yoyo = new int[6];
        yoyo[0] = 12;
        yoyo[1] = 14;
        yoyo[2] = 16;
        yoyo[3] = 18;
        yoyo[4] = 20;
        yoyo[5] = 22;

        for(int i=0; i<6;i++){
            System.out.println(yoyo[i]);
        }
        int ans = find(yoyo,16);

        System.out.println("the index value of the variable that u r finding is" + ans);

        double [] yoyo2 = {1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1, 8.1};

        for(int i = 0; i<6; i++){
            System.out.println(yoyo2[i]);
        }

        String [] yoyo3 = new String[4];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<4; i++){
            yoyo3[i] = sc.nextLine();
        }
        System.out.println("now printing the array");
        for(int i=0; i<4; i++){
            System.out.println(yoyo3[i]);
        }

        
    }

    public static int find(int [] arr, int d) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == d){
                return i;
            }
        }

        return -1;
        
    }
}
