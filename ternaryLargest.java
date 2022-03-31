import java.util.Scanner;
public class ternaryLargest {
    public static void main(String[] args)
    {
        int num1,num2,num3,largest;
        System.out.println("Enter any three number");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        largest = (num1>num2)?(num1>num3 ? num1:num3):(num2>num3 ? num2:num3);
         System.out.println("the largest among three numbers is " + largest);

    }
}
