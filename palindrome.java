import java.util.Scanner;
public class palindrome {
    public static String reverseString(String str)
    {
        char ch[] = str.toCharArray();
        String rev = "";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev = rev+ch[i];
        }
        return rev;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter any string");
        Scanner scan = new Scanner(System.in);
        String str_ip = scan.nextLine();
        String str_rev;
        str_rev = reverseString(str_ip);
        if(str_ip.equals(str_rev)==true)
        {
            System.out.println("The String is Palindrome");
        }
        else
        {
            System.out.println("The String is not Palindrome");
        }
    }
}
