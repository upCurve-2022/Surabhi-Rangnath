import java.util.Scanner;
public class substring {
    static int isSubstring(
            String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();


        for (int i = 0; i <= N - M; i++) {
            int j;


            for (j = 0; j < M; j++)
                if (s2.charAt(i + j)
                        != s1.charAt(j))
                    break;

            if (j == M)
                return i;
        }

        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter main string.");
        String str2 = scan.nextLine();
        System.out.println("Enter a string to check if it is present.");
        String str1 = scan.nextLine();
        int res = isSubstring(str1, str2);

        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present ");
    }
}
