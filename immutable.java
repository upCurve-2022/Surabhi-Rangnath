import java.util.Scanner;
public class immutable {
    public static void checkReference(Object x, Object y)
    {
        if(x==y)
        {
            System.out.println("both strings are pointing to same refrences");
        }
        else
        {
            System.out.println("Both strings are pointing to different refrences");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str1 = "immutable";
        String str2 = "immutable";
        System.out.println("Before modification");
        checkReference(str1,str2);
        str1 = str1+"refrence";
        System.out.println("After modification");
        checkReference(str1,str2);
    }

}
