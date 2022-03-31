import java.util.Scanner;
public class duplicateCharacter {
    public static void main(String[] args)
    {
        int count =0;
        System.out.println("Enter any word.");
        Scanner scan = new Scanner(System.in);
        String str =  scan.nextLine();
        char[] inp = str.toCharArray();
        System.out.println("Duplicate characters are:");
        for(int i =0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(inp[i]==inp[j])
                {
                    System.out.println(inp[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
