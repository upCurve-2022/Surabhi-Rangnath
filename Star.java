import java.util.Scanner;
public class Star{
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}