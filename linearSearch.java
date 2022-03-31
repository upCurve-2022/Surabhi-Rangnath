import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args)
    {
        System.out.println("Enter the total number of elements in array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num[] = new int[100];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            num[i] = scan.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int rec = scan.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(num[i]==rec)
            {
                count =i;
            }
        }
        if(count >0)
        {
            System.out.println("The number is present in the array");
        }
        else
        {
            System.out.println("The number is not present in the array");
        }
    }
}
