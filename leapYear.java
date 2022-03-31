import java.util.Scanner;
public class leapYear {
    public static void main(String[] args)
    {
        System.out.println("Enter any year");
        Scanner scan = new Scanner(System.in);
        int year =  scan.nextInt();
        int num,check;
        num = year % 100;
        if(num==0)
        {
            check = year % 400;
        }
        else
        {
            check = num % 4;
        }
        if(check == 0)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}
