import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the " + n + " elements of the array: ");
        for (int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int index){
        if(index== arr.length){
            return;
        }
        System.out.println("printin the element " + index + " of array which is " + arr[index]);
        displayArr(arr, index+1);
    }
}