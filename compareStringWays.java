import java.util.Scanner;
public class compareStringWays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str1 = scan.nextLine();
        System.out.println("Enter another String :");
        String str2 = scan.nextLine();
        System.out.println("By equals() method: " + str1.equals(str2));
        System.out.print("By == operator: ");
        System.out.print(str1 == str2);
        System.out.println("By CompareTo() method: " + str1.compareTo(str2));

    }
}
