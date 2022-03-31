public class profitLoss {
    public static void main(String[] args)
    {
        int cp = 50;
        System.out.println("The cost price of the pen is " + cp + "Rs.");
        float discount = 12;
        System.out.println("The discount the user gets is "+ discount + "%");
        float per = discount/100;
        float discountAmount = cp*per;
        float sp = cp-discountAmount;
        System.out.println("The discount amount is " + discountAmount + "Rs.");
        System.out.println("The selling price is " + sp + "Rs.");
    }
}
