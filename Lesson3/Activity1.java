package Lesson3;
import java.util.Scanner;
public class Activity1 {
    public static void main(String[] args) {
        Scanner codingal = new Scanner(System.in);
        int a = codingal.nextInt();
        boolean leapyear  = a % 4 == 0 && (a % 100 != 0 || a % 400 == 0 )? true: false;
        System.out.println("year is leap year: " + leapyear);
    }
}
