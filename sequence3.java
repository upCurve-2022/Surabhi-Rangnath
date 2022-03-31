import java.util.Scanner;
import java.lang.Math;
public class sequence3 {
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=num;i++)
        {
            int ans = (int)Math.pow(i,i);
            System.out.print(ans + ",");
        }
    }
}
