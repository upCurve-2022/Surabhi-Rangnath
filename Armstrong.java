import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digit, sum = 0;
        int num1 = num;
        while (num > 0) {
            digit = num % 10;
            sum = sum + digit * digit *digit;
            num = num / 10;
        }
        if (sum == num1) {
            System.out.println("The number is Armstrong number.");
        } else {
            System.out.println("The number is not Armstrong number");
        }
    }
}
