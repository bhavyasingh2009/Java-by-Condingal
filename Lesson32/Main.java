package Lesson32;

public class Main {
    public static void selectionSort(int[] arr) {
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int min_index=i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }

            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i] = temp
        }
    }
    public static void main(String[] args) {
        int[] number={64,12,11,24,25};
        System.out.println("original array");

        for(int num:number) System.out.println(num + " ");
        
        selectionSort(number);
        System.out.println("sorted array");
        for(int num:number) System.out.println(num + " ");
    }
}
