package Day14;

public class CombinationFunction {

    public static int Combination(int n, int r) {

        int min = 0;

        if ((n - r) < r) {
            min = n - r;
        } else {
            min = r;
        }

        long res = 1;

        for (int i = 0; i < min; i++) {
            res = res * (n - i) / (i + 1);
        }

        return (int) res;
    }

    public static void main(String[] args) {

        int a = Combination(5, 2);
        System.out.println(a);

    }
}
