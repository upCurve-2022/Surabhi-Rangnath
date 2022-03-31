import java.util.Scanner;
public class largestNumber {
    public static void main(String[] args)
    {
        System.out.println("Enter any three number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Largest: "+a);
            if(b>c)
            {
                System.out.println("Second largest: "+ b);
            }
            else
            {
                System.out.println("Second largest: "+c);
            }
        }
        if(b>a && b>c)
        {
            System.out.println("Largest: "+b);
            if(a>c)
            {
                System.out.println("Second largest: "+ a);
            }
            else
            {
                System.out.println("Second largest: "+c);
            }
        }
        if(c>b && c>a)
        {
            System.out.println("Largest: "+c);
            if(a>b)
            {
                System.out.println("Second largest: "+ a);
            }
            else
            {
                System.out.println("Second largest: "+b);
            }
        }

    }
}
