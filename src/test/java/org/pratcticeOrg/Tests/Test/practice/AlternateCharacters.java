package org.pratcticeOrg.Tests.Test.practice;

import java.util.PriorityQueue;
import java.util.*;

public class AlternateCharacters {
    public static void removeConsigutiveChar(String str)
    {
        //aabbcc
        //ababcc
        char[] ch = str.toCharArray();
        String result ="";

        int count=0,max=0;
        for (char c : ch){
            if (c == 'a')
            {
                count++;
                if(count > max)
                    max = count;
            }
            else count = 0;
        }
        System.out.println(max);

        result += ch[0];max--;

        for (int i =0; i < ch.length; ++i)
        {
            if(ch[i] != 'a'){
                result += ch[i];
                if(max >0)
                {
                    result += 'a';
                    --max;
                }
            }


        }
        System.out.print(result);
    }
    public static void main(String args[]) {
        //charReplica("aabyz");
        removeConsigutiveChar("aaaaabaaaaaabcdefg");

    }
}
//a,b,c,d,e,f,g,h,i,j,k,l,m
//n,o,p,q,r,s,t,u,v,w,x,y,z
//        {('a','z'),('b','y'),}