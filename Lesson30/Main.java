package Lesson30;

public class Main {
    public static void main(String[] args){
        int[] arr = { 2, 3, 4, 10, 40, 50, 60, 70, 80, 90, 700, 110};
        int x = 100;
        int result = binarySearch(arr, x);
        if(result == -1)
           System.out.println("element not present");
        else
            System.out.println("element found at index " + result);
    }

    static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right-left) / 2;

            System.out.println("left: " + left + "right: " + right + ", mid: " + mid);

            if(arr[mid] == x)
               return mid;

            if(arr[mid] < x)
               left = mid+1;


            else
                right = mid-1
        }

        return -1 ;
    }
    
}
