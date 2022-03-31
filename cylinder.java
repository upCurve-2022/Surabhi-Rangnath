import java.util.Scanner;
import java.lang.Math.*;
public class cylinder {
    public static void main(String[] args)
    {
        System.out.println("Enter the values of radius and height for the cylinder");
        Scanner scan = new Scanner(System.in);
        float r = scan.nextFloat();
        float h = scan.nextFloat();
        double vol = Math.PI*r*r*h;
        System.out.println("The volume of cylinder is " + vol);

    }
}
