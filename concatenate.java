import java.util.Scanner;
public class concatenate {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 = scan.nextLine();
        System.out.println("Enter string 2");
        String str2 = scan.nextLine();
        String str3 = str1.concat(str2);
        System.out.println("The concatenated string is " + str3);
    }
}
