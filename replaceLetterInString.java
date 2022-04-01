import java.util.Scanner;
public class replaceLetterInString {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the original sentence");
        String str = scan.nextLine();
        System.out.println("String after replacing 'a' with '$' :" );
        System.out.println(str.replace('a','$'));
    }
}
