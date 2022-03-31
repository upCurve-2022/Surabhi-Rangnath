import java.util.Scanner;
public class sequence5 {
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        int ans =1;
        System.out.print(ans);
        for(int i=1;i<=num;i++)
        {
            ans = (ans*2)+3;
            System.out.print("," + ans);
        }
    }
}
