import java.util.Scanner;
public class stringUpper {
    public static void main(String[] args)
    {
        System.out.println("Enter any word ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String upperCase = str.toUpperCase();
        System.out.println("The String Changed to upper case is " + upperCase);
    }
}
