import java.util.Scanner;
public class numberWords {
    public static void main(String[] args)
    {
        int n;
        String word = "";
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while(num>0)
        {
           int rem = num %10;
           switch(rem)
           {
               case 0:
                   word = "Zero " + word;
                   break;

               case 1:
                   word = "One " + word;
                   break;

               case 2:
                   word = "Two " + word;
                   break;

               case 3:
                   word = "Three " + word;
                   break;

               case 4:
                   word = "Four " + word;
                   break;

               case 5:
                   word = "Five " + word;
                   break;

               case 6:
                   word = "Six " + word;
                   break;

               case 7:
                   word = "Seven " + word;
                   break;

               case 8:
                   word = "Eight " + word;
                   break;

               case 9:
                   word = "Nine " + word;
                   break;

           }
           num = num/10;
        }
        System.out.println("The given numer in words is: " + word);
    }
}
