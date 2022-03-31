import java.util.Scanner;
public class oddEven {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = scan.nextInt();
        if(n%2==0)
        {
            System.out.println("Entered number is Even.");
        }
        else
        {
            System.out.println("Entered number is Odd.");
        }
    }
}
