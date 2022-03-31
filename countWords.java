//package com.company;
//import java.util.Scanner;
//public class countWords {
//    static int wordcount(String string)
//    {
//
//        int count =0;
//        char ch[] = new char[string.length()];
//        for(int i=0;i<string.length();i++)
//        {
//            ch[i] = string.charAt(i);
//            if(((i>0)&&(ch[i]!='')&&(ch[i-1] ==''))||((ch[0]!='')&&(i==0)))
//            {
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any sentence");
//        String str = scan.nextLine();
//        System.out.println("Number of words are" + wordcount(str));
//    }
//}
