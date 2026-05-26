package Day14;

public class BinaryToDecimal {

    public static void BinaryToDecimal(int n){

        int res = 0;
        int base = 1;

        while(n>0){
            int dig = n % 10;
            res = res + dig * base;

            base *= 2;

            n/=10;
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        BinaryToDecimal(1010);
    }
}



////String code
//String s = 1010;
//int j = s.length() - 1;
//
//while(j >= 0){
//    int dig =(s.charAt(j)-'0');
//    res = res + dig*place;
//    place *= 2
//        j--;
//        }