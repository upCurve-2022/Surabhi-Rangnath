import java.util.Scanner;
public class sequence6 {
    public static void main(String[] args)
    {
        System.out.println("Enter any number ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum =1;
        for(int i=0;i<num;i++)
        {
            sum = sum + i * i;
            if (i%2==0)
            {
                System.out.print(sum + ",");
            }
            else
            {
                System.out.print(-sum + ",");
            }
        }
    }
}
