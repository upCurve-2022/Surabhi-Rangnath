import java.util.Scanner;
public class swapThree {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter First number");
        int a = scan.nextInt();
        System.out.println("Enter Second number");
        int b = scan.nextInt();
        System.out.println("Enter Third number");
        int c = scan.nextInt();
        a = a+b+c;
        b = a-(b+c);
        c = a-(b+c);
        a = a-(b+c);
        System.out.println("The numbers are "+ a+","+b+" and "+c+".");
    }
}
