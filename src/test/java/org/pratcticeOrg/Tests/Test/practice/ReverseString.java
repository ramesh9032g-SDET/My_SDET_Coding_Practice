package org.pratcticeOrg.Tests.Test.practice;

public class ReverseString {

    public static void stringReverse(String str)
    {   String reverse="";
        for (int i= str.length()-1 ; i >= 0 ; --i)
        {
            reverse += str.charAt(i);
        }
        System.out.println("Reverse of the String is : "+ reverse );
    }

    public static void main(String[] args)
    {
        String str ="ramesh";
        stringReverse(str);
    }

}
