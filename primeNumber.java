import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lowerlimit :");
        int ll = scan.nextInt();
        System.out.println("Enter the upper limit :");
        int ul = scan.nextInt();
        for(int i =ll ;i<=ul;i++)
        {
            int count =0;
            for(int j=2; j<=i/2;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.print(i + ",");
            }
        }

    }
}
