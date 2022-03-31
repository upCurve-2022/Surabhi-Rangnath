import java.util.Scanner;
public class powerfun {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base value");
        int x = scan.nextInt();
        System.out.println("Enter the power value");
        int n = scan.nextInt();
        int power=1;
        for(int i=1;i<=n;i++)
        {
            power = power*x;
        }
        System.out.println("The answer is :" + power);
    }
}
