import java.util.Scanner;
public class swapTwo {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        a = a-b;
        b = a+b;
        a= b-a;
        System.out.print("The numbers are "+ a + " and " + b + ".");


    }
}
