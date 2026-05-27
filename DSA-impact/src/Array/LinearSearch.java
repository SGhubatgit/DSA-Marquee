package Array;

import java.util.*;

public class LinearSearch {

    public static boolean function1(int size, int[] arr, int target) {
        Scanner sc = new Scanner(System.in);

        boolean s = false;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                s = true;
                break;
            }
        }

        return s;
    }

    public static int function2(int size, int[] arr, int target) {
        Scanner sc = new Scanner(System.in);

        int index = -1;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.println(function1(5, arr, 3));
        System.out.println(function2(5, arr, 3));
    }
}