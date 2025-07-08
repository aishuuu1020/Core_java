import java.util.*;
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l,b,a;
        System.out.println("Enter the length:");
        l=sc.nextDouble();

        System.out.println("Enter the breadth:");
        b=sc.nextDouble();

        a=l*b;
        System.out.println("Area of a rectangle:"+a);

    }
}
