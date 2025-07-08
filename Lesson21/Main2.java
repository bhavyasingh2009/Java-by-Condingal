package Lesson21;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr3 = new int[n][m];

        for (int i = 0; i<arr3.length; i++){
            for(int j = 0; j<arr3[1].length; j++){
                arr3[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<arr3.length; i++){
            for(int j = 0; j<arr3[1].length; j++){
                System.out.println(arr3[i][j]);
    }
    
}
    

}
    
}
    