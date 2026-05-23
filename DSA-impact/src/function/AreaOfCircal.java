package function;

public class AreaOfCircal {

    float pi = 3.14F;

    public float AreaofCircle(int r){
        float area = pi*r*r;
        return area;
    }

    public static void main(String[] args) {

        AreaOfCircal a = new AreaOfCircal();

        System.out.println(a.AreaofCircle(5));
    }
}
