package Lesson24;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the no. of array");
     int n1 = sc.nextInt();
     
     ArrayList<ArrayList<Integer>> list = new ArrayList<>();

     for(int i = 0; i < n1; i++){
        System.out.println("enter the size of array" + (i + 1) + ": ");
        int n = sc.nextInt();

        ArrayList<Integer> l2 = new ArrayList<>();

        System.out.println("enter the " + n1 + "element of array" + (i + 1) + ": ");
        for(int j = 0; j < n1; j++ ){
            l2.add(sc.nextInt());
        }

        list.add(i, 12);
     }

     System.out.println("enter the queries you need to process: ");
     int num = sc.nextInt();

     for(int k = 0; k<num; k++){
        System.out.println("enter row and column for query: " + (k+1)+ ": ");
        int m = sc.nextInt();
        int o = sc.nextInt();

        try{
            System.out.println("element at (" + m + "," + o + ":" + list.get(m-1).get(o-1));

        }catch(Exception e){
            System.out.println("error");
        }
     }

    }
    
}
