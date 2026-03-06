package org.pratcticeOrg.Tests.Test.practice;
import java.util.*;

public class InterviewPractice {

    public static void random() {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);
    }

    public static void fibonacci(int num)
    {
        int i=0,j=1,temp=0;
        //System.out.println(i+ j);
        for (int k = 0 ; j < num ; k++)
        {
            System.out.println(i);
            temp = j+i;
            i=j;
            j=temp;
        }

    }

    public static void duplicates() {
        String s = "my name is Ramesh";
        HashSet<Character> remove = new HashSet<Character>();
        StringBuilder res = new StringBuilder();
        char[] var3 = s.toCharArray();
        int var4 = var3.length;
        String str = "";

        for(char c: var3) {
            //char c = var3[var5];
            if (remove.add(c)) {
                res.append(c);
            }else if(c != ' '){str = str+c; }
        }

        System.out.println("Duplicate elements are : " +str);
        System.out.println("Duplicate element is removed :" + res);
    }

    public static void arrayCompare()
    {
        int[] a = new int[]{1,5,26,34,7,18};
        int startingValue = a[0];

        for(int i = 0; i < a.length; ++i) {
            if (startingValue < a[i]) {
                int temp = 0;
                startingValue = a[i];
                a[i] = temp;
                System.out.println("Starting Value ::: " + startingValue);
            }
        }
    }

    public static int total(Integer[] a, int total) {
        Arrays.sort(a);
        return a[total - 1];
    }

    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        System.out.println("Leaders in the array:");
        System.out.print(maxFromRight + " ");

        for(int i = n - 2; i >= 0; --i) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }

    }

    public static void reverseNumber(int num) {
        //35245
        int revDigit =0;
        //for (int i = num; i > 0;i /= 10 ){
        while(num>0){
            revDigit = revDigit * 10 + num%10;
            num /= 10;
        }
        System.out.print("reverse for digit is :" + revDigit);
    }

    public static void reverseWords(String str) {
        String[] words = str.split(" ");
        int len = words.length;
        String revString="";

        //for (int i =len-1; i >= 0; --i) // str reverse and reverse => "ereh hsemaR ! ereht olleH"
        for (int i =0; i < len; i++) // inplace str reverce       => "olleH ereht ! hsemaR ereh"
        {
            String s = words[i];
            for (int j = s.length()-1; j >= 0 ; --j)
            {
                if( j == 0)
                {revString += Character.toUpperCase(s.charAt(j));break;}
                revString += s.charAt(j);
            }
            revString += " ";
        }
        System.out.print("reverse for String is :" + revString);
    }

    public static void capitalize() {
        String s = "abddee";
        HashMap<Character, Integer> frequency = new HashMap();
        char[] var2 = s.toCharArray();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            char c = var2[var4];
            frequency.put(c, (Integer)frequency.getOrDefault(c, 0) + 1);
        }

        Iterator var6 = frequency.keySet().iterator();

        char d;
        while(var6.hasNext()) {
            d = (Character)var6.next();
            if ((Integer)frequency.get(d) % 2 == 0) {
                System.out.print(Character.toUpperCase(d));
            }
        }

        var6 = frequency.keySet().iterator();

        while(var6.hasNext()) {
            d = (Character)var6.next();
            if ((Integer)frequency.get(d) % 2 != 0) {
                System.out.println(Character.toUpperCase(d));
            }
        }

    }

    public static void charCount(String str) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char c:str.toCharArray())
        {
         hm.put(c,hm.getOrDefault(c,0) + 1);
        }
        System.out.println(hm);
        Set mst = hm.entrySet();
        Iterator itr =  mst.iterator();

        while(itr.hasNext())
        {
            Map.Entry<Character, Integer> entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    public static void add2Arrays() {
        ArrayList<Integer> a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        ArrayList<Integer> b = new ArrayList();
        b.add(10);
        b.add(20);
        System.out.println(b);
        ArrayList<Integer> c = new ArrayList();
        c.addAll(a);
        c.addAll(b);
        Iterator var4 = c.iterator();

        while(var4.hasNext()) {
            Integer d = (Integer)var4.next();
            System.out.println(d);
        }

    }

    public static void pyramidPattern(int num){

        int temp = num, temp1 =num;
        for (int i =1; i <= num; ++i)
        {
            for (int j = temp; j > 0 ; --j)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; ++k)
            {
                System.out.print("* ");
            }
            System.out.println();
            temp--;
        }
        // second half
        for (int l =1; l <= num; ++l)
        {
            for(int m = 0; m <= l; ++m)
            {
                System.out.print(" ");
            }
            for (int n = temp1-1; n > 0; --n)
            {
                System.out.print("* ");
            }
            System.out.println();
            temp1--;
        }
    }

    public static void missingNum() {
        int[] numbers = new int[]{1,2,3,4,5,6,7,9,10};
        int n = numbers.length;
        int sum1 = (n + 1) * (n + 2) / 2;
        int sum2 = 0;

        int missingNumber;
        for(missingNumber = 0; missingNumber < n; ++missingNumber) {
            sum2 += numbers[missingNumber];
        }

        missingNumber = sum1 - sum2;
        System.out.println("The missing integer in the sequence is: " + missingNumber);
    }

    public static void main(String args[]) {
        //random();
        //fibonacci(10);
        //duplicates();
        //arrayCompare();
        //int[] a = new int[]{1,5,26,34,7,18};
        //System.out.println(total(a, 4));
        //findLeaders(a);
        //reverseNumber(54239685);
        //reverseWords("hello there ! ramesh here");
        //capitalize();
        //charCount("aabibaa");
        //add2Arrays();

//        String s = "Geeks";
//        String s2 = "Geeks";
//        String n = s.substring(0,s.length());
//        System.out.println(n);
//        System.out.println(s2.indexOf('k'));

//        for (int i = 0; i <=20; ++i) {
//            pyramidPattern(i);
//        }
        missingNum();

    }
}
// select top 5 salary emp Names from emp table
// select * from table where ( sal IN ( select TOP(5) salary from table as temptbl Group By salary Group By salary DESC))