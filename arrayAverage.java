import java.util.Scanner;
public class arrayAverage {
    public static void main(String [] args)
    {
        int num [] =  new int[1000];
        System.out.println("Enter the total number of elements in an array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=0;
        float avg;
        System.out.println("Enter the elements of the array");
        for (int i =0; i<n ;i++ )
        {
            num[i] = scan.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            sum = sum+num[i];
        }
        avg = sum/n;
        System.out.println("The average of elements in the array is " + avg);
    }
}
