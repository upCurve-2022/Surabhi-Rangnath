import java.util.Scanner;
import java.lang.String;
public class intrest {
    public static void main(String[] args)
    {
        float si;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thr principal amount:");
        float p  = scanner.nextFloat();
        System.out.println("Enter the rate of intrest :");
        float r  = scanner.nextFloat();
        System.out.println("Enter the time period :");
        int t  = scanner.nextInt();
        si =  p*r*t;
        System.out.println("The Simple Intrest is :"+si);



    }

}
