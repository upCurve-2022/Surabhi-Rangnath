import java.util.Scanner;
public class squareSeries {
        public static void main(String[] args)
        {
            System.out.println("Enter any number: ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            for(int i=1;i<num;i++)
            {
                int square = i * i;
                System.out.print(square + ",");
            }
        }
    }

