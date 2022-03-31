import java.util.Scanner;
public class oddSum {
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if (i % 2 == 1)
            {
                sum = sum + i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to "+n+" is "+ sum+ ".");
    }
}
