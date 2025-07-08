import java.util.*;
public class ArmNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, d,cube,sum=0;
        System.out.println("enter a number:");
        n=sc.nextInt();
        int t = n;
        while(n>0)
        {
            d=n%10;
            cube=d*d*d;
            sum=sum+cube;
            n=n/10;

        }
        if(sum==t)
        {
            System.out.println("Given number is an armstrong:");
        }
        else{
            System.out.println("Given no is not armstrong:");
        }

    }
}
