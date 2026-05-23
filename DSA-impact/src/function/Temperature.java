package function;

public class Temperature {

    public static  double CelsiusToFahrenhite(float c){
        double F = (c*9/5) + 32;

        return F;
    }

    public static void main(String[] args) {

        System.out.println("Fahrenhite: " + CelsiusToFahrenhite(+ 35.08f));
    }
}
