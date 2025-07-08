package Lesson21;

public class Main {
     public static void main(String[] args) {
        String[][] arr2 = new String[4][3];

        for (int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2[1].length; j++){
                arr2[i][j] = "row: " + i + " " + "col: " + j;
            }
        }

        for (int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2[1].length; j++){
                System.out.println(arr2[i][j]);

        }
    }
    
}

}
   