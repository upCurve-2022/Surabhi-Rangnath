import java.util.Scanner;
public class sequence1 {
    public static void main(String[] args)
    {
        System.out.println("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=2;i<num;i++)
        {
            if(i%2 ==0)
            {
                int square = i * i;
                System.out.print(square + ",");
            }
        }
    }
}

