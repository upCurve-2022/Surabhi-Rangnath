import java.util.Scanner;
import java.lang.Math;
public class wholeFraction {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        double value = scan.nextDouble();
//        int integerPart = (int)value;
//        double fraction_part = value-(double)integerPar
        String fraction = Double.toString(value);
        String[] arrofstr = fraction.split(".");
        for(String a: arrofstr)
        {
            System.out.println(a);
        }

//        System.out.println(fraction);
//        int n = fraction.length();
//        double power=Math.pow(10,n-2);
//        fraction_part = power*fraction_part;
//        int partTwo = (int)fraction_part;
//        System.out.println(integerPart);
//        System.out.println(partTwo);

    }
}
