package Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecimalToBinary {

//    public static void DecimalToBinary(int n) {
//
//        List<Integer> list = new ArrayList<>();
//
//        while (n != 0) {
//            int rem = n % 2;
//            list.add(rem);
//            n = n / 2;
//        }
//
//        Collections.reverse(list);
//
//        for (int bits : list) {
//            System.out.print(bits);
//        }
//    }

    public static void DecimalToBinary(int n){
        int res = 0;
        int place = 1;
        while(n > 0){
            int rem = n % 2;
            res = res + rem * place;
            place *= 10;
            n /= 2;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        DecimalToBinary(10);
    }
}