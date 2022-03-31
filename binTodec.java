import java.util.Scanner;
import java.lang.Math;
public class binTodec {
    public static void toDecimal(int binary)
    {
        int decimal =0;
        int power = 0;
        while(true)
        {
            if (binary == 0)
            {
                break;
            }
            else {
                int temp = binary % 10;
                int mul = (int) Math.pow(2, power);
                decimal = decimal + temp * mul;
                binary = binary/10;
                power++;
            }

        }
        System.out.println(decimal);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter any binary number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("the decimal conversion of the number is:");
        toDecimal(num);
    }
}
