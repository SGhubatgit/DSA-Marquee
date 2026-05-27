package Array;

import java.util.*;

public class FindEven {

    public static void FindEvenArray(int n){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[n];


        System.out.println("Enter elements of array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();  // compile time
        }

        System.out.println("This is garbage value: "+arr); // print garbage value

        System.out.print("Even Array: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }


    }

    public static void main(String[] args) {

        FindEvenArray(5);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your Array size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter emements of array: ");
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();  // compile time
//        }
//
//        System.out.println("This is garbage value: "+arr); // print garbage value
//
//        System.out.print("Even Array: ");
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % 2 == 0){
//            System.out.print(arr[i] + " ");
//            }
//        }


    }
}
