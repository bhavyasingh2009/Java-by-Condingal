package Lesson22;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array list you want, don't worry this is a arraylist you can increase it's sixe later also ");
        int size = sc.nextInt();

        ArrayList<Integer> a1 = new ArrayList<>();

        System.out.println("one by one enter the ages of everyone ");

        for(int i=0; i<size; i++){
            a1.add(sc.nextInt());
        }

        System.out.println(a1);

        System.out.println("now one by one enter the name of your person");

        ArrayList<String> al1 = new ArrayList<>();

        for(int i=0; i<size; i++){
            al1.add(sc.nextLine());
        }

        System.out.println(al1);

        sc.close();
    }
}
