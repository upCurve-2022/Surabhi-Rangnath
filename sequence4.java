import java.util.Scanner;
public class sequence4 {
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int lim = scan.nextInt();
        int num[] = new int[100];
        num[1] = 1;
        num[2] = 4;
        num[3]=7;
        System.out.print(num[1]+ ",");
        System.out.print(num[2]+ ",");
        System.out.print(num[3]+ ",");
        for(int i=4;i<=lim;i++)
        {
            num[i] = num[i-1]+num[i-2]+num[i-3];
            System.out.print(num[i] + ",");
        }
    }
}
