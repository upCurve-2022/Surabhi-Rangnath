import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        System.out.println("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println("The factorial of given number is " + fact);
    }
}
