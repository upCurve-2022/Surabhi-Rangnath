import java.util.Scanner;
public class numberRev {
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rem,rev = 0;
        while(num!=0)
        {
            rem = num %10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println("The reversed number is " + rev);

    }
}
