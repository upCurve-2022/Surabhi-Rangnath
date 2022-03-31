import java.util.Scanner;
public class sequence7 {
    public static void main(String[] args)
    {
        System.out.println("Enter any number ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num[] = new int[100];
        num[1] = 1;
        num[2] = -2;
//        System.out.print(num[1] + ",");
//        System.out.print(num[2] + ",");
        for(int i=3;i<n;i++)
        {
            if(i%2==1)
            {
                num[i] =num[i-2] + 3;
                System.out.print(num[i] + ",");
            }
            else
            {
                num[i] = num[i-2] + 4;
                System.out.print(-num[i] + ",");
            }

        }
    }
}
