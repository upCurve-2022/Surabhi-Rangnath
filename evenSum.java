import java.util.Scanner;
public class evenSum {
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sum = sum +i;
            }
        }
        System.out.println("The sum of even numbers from 0 to "+ n+" is "+ sum+ ".");
    }
}
