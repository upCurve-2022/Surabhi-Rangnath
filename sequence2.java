import java.util.Scanner;
public class sequence2 {
    public static void main(String[] args)
    {
        System.out.println("Enter any number:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num =1;
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.print(i + ",");
            }
            else
            {
                int neg = i*(-1);
                System.out.print(neg + ",");
            }
        }
    }
}
