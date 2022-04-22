public class EmptyString {
    public static void checkEmpty(String s){
        if(s=="")
        {
            System.out.println("String is Empty");
        }
        else
        {
            System.out.println("String is not Empty");
        }
    }
    public static void main(String[] args) {
        String s="";
        String t="Surabhi";
        checkEmpty(s);
        checkEmpty(t);
        // write your code here
    }
}
