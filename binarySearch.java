import java.util.Scanner;
public class binarySearch {
    public static void main(String[]args)
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

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        System.out.println("Enter the element to be searched");
        int ser = scan.nextInt();

        int first, last,mid;
        first = 0;
        last = n-1;
        mid = (first+last)/2;
        while(first<=last)
        {
            if(num[mid]<ser)
            {
                first = mid+1;
            }
            else if(num[mid]==ser)
            {
                System.out.println("Entered number is found.");
                break;
            }
            else
            {
                last = mid-1;
            }
            mid = (first + last)/2;
        }
        if(first > last)
        {
            System.out.println("Entered number not found");
        }

    }
}
