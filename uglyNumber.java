import java.util.Scanner;
public class uglyNumber {
    static int divideByGreatestDivisible(int number , int gdp)
    {
        while(number%gdp == 0)
        {
            number = number/gdp;
        }
        return number;
    }
    static int checkUglyNumber(int number)
    {
        int flag ;
        number = divideByGreatestDivisible(number,2);
        number = divideByGreatestDivisible(number,3);
        number = divideByGreatestDivisible(number,5);
        return number;
    }
    public static void main(String[] main)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scan.nextInt();
        if(checkUglyNumber(num) == 1)
        {
            System.out.println(num + " is an Ugly number.");
        }
        else
        {
            System.out.println(num + " is not 100an Ugly number.");
        }
    }
}
