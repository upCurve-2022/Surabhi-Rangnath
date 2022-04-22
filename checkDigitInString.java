import java.util.Scanner;
public class checkDigitInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = scan.nextLine();
        int i = 0;
        int count = 0;
        while (i < str.length()) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
            }
            i++;
        }
        if (count == str.length()) {
            System.out.println("String contains all digits");
        } else {
            System.out.println("String do not contain all digits");
        }

    }
}