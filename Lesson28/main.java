import java.util.ArrayList;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2));

        ArrayList<Integer> current = new ArrayList<>();

        printSubsequences(arr, 0, current);

    }

    static void printSubsequences(ArrayList<Integer> arr, int index, ArrayList<Integer> current) {

        if (index == arr.size()) {

            System.out.println(current);

            return;

        }

        printSubsequences(arr, index + 1, current);

        current.add(arr.get(index));

        printSubsequences(arr, index + 1, current);

        current.remove(current.size() - 1);

    }

}
