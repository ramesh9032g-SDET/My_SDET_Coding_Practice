package org.pratcticeOrg.Tests.Test.practice;

import java.util.HashMap;

public class Test {
    //aabbbccaa
    //a2b3c2a2
    public static void charCount(String str)
    {
        HashMap<Character,Integer> charC = new HashMap<>();
        for(int i = 0; i <= str.length()-1; i++)
        {
            charC.put(str.charAt(i), charC.getOrDefault(str.charAt(i),0) + 1);

        }
        System.out.println("The char count of the string is : " + charC.toString() );
    }


    public static void main(String[] args){
        String st = "aabbbccaa";
        charCount(st);


    }
}
