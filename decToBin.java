import java.util.Scanner;
public class decToBin {
    public static void toBinary(int decimal)
    {
        int binary[] = new int[40];
        int index =0;
        while(decimal>0)
        {
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i=index-1;i>=0;i--)
        {
            System.out.print(binary[i]);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to find it's binary");
        int num = scan.nextInt();
        System.out.println("Binary of " + num + " is " );
        toBinary(num);
    }
}
