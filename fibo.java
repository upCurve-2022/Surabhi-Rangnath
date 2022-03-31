import java.util.Scanner;
public class fibo {
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int num[] = new int[100];
        num[1] =1;
        num[2] =1;
        System.out.print(num[1] + ",");
        System.out.print(num[2] + ",");
        for(int i=3; i<number;i++)
        {
            num[i] = num[i-1]+num[i-2];
            System.out.print(num[i] + ",");
        }
    }
}
