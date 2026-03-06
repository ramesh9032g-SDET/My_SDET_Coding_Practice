package org.pratcticeOrg.Tests.Test.practice;

import java.util.HashMap;

public class Main {

    public static void anagram()
    {
        String str1 = "Sister", str2 = "Resist";
        //String str1 = "Sister", str2 = "Resiss";
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();

        for (char ch : str1.toLowerCase().toCharArray())
        {
            map1.put(ch, map1.getOrDefault(ch,1)+1);
        }

        for (char ch : str2.toLowerCase().toCharArray())
        {
            map2.put(ch, map2.getOrDefault(ch,1)+1);
        }

        if (map1.equals(map2))
        {
            System.out.print("Input stings are Anagram");
        }
        else {
            System.out.print("Input stings are not Anagram");
        }
    }

    public static void strCaseReverse(String str) {
        //Input: HeLlo WoRld
        //Output: hElLO wOrLD

        String outStr = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                outStr += Character.toUpperCase(str.charAt(i));
            } else if (Character.isUpperCase(str.charAt(i))) {
                outStr += Character.toLowerCase(str.charAt(i));
            } else if (str.charAt(i) == ' ') {
                outStr += ' ';
            } else {
                outStr += str.charAt(i);
            }
        }
            System.out.println(str + "\n" +outStr);

            }

    public static void main(String[] args) {
        //anagram();

        String str = "HeLlo@ W _.oRld";
        strCaseReverse(str);
    }
}