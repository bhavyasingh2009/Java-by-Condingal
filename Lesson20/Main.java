package Lesson20;

import java.util.Random;

public class Main {
    public static int maxSubarrySum(int[] arr){
          int max_so_far = Integer.MIN_VALUE;
        int current_max = 0;

        for(int i=0; i<arr.length; i++){
            current_max = current_max + arr[i];

            if(current_max > max_so_far){
                max_so_far = current_max;
            }

            if(current_max < 0){
                current_max = 0;
            }
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,7,8,10,12,15,19,20,25,22,29,27};
        System.out.println(maxSubarrySum(arr));

      
    }
   
    
}
