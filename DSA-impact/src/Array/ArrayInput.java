package Array;
import java.sql.SQLOutput;
import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter emements of array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();  // compile time
        }

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
