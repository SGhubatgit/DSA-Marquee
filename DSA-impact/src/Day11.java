import javax.xml.transform.Source;

public class Day11 {

    public static void main(String[] args) {


//                int n = 4;
//                for(int i = 0; i < n; i++){
//                    for(int j = 0; j < n - i - 1; j++){
//                        System.out.print(" ");
//                    }
//                    for(int k = 0; k < i + 1; k++){
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }
//                for(int i = 0; i < n; i++){
//
//                    for(int j = 0; j < i; j++){
//                        System.out.print(" ");
//                    }
//                    for(int k = 0; k < n - i; k++){
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }


////        hollow square
//        int n = 4;
//
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n; j++){
//                 if(i == 1 || i == n|| j == 1|| j == n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//
//             }
//             System.out.println();
//         }


//        hollow triangle

//                int n = 5;
//
//                for(int i = 1; i <= n; i++){
//
//                    for(int j = 1; j <= n - i; j++){
//                        System.out.print(" ");
//                    }
//                    for(int k = 1; k <= i; k++){
//
//                        if(i == 1 || k == 1 || k == i || i == n){
//                            System.out.print("* ");
//                        } else {
//                            System.out.print("  ");
//                        }
//                    }
//
//                    System.out.println();
//                }

//       stair case

//        int n = 3;

//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= 2; j++){
//                for(int k = 1; k <= i; k++){
//                    System.out.print("**");
//                }
//                System.out.println();
//            }


        int  n = 6;
        int star = 2;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= star; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i%2 == 0){
                star += 2;
            }

        }
    }
}




