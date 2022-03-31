import java.util.Scanner;
import java.lang.Math.*;
public class perfectSquare {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to check if it is a perfect square");
        int num = scan.nextInt();
        double num_root = Math.sqrt(num);
        if(Math.floor(num_root)-num_root ==0)
        {
            System.out.println(num + " is a perfect square");
        }
        else
        {
            System.out.println(num + " is not a perfect square");
        }
    }
}
