package org.pratcticeOrg.Tests.Test.practice;

import org.example.Enums.Trade;
import org.example.Enums.Transaction;
import org.pratcticeOrg.Tests.Helpers.Common.DataProviderClass;
import org.testng.annotations.Test;

import java.util.*;

public class ConsecutiveOnes {

    // PHONEPE - Round1
    @Test (dataProvider = "getConsecutiveOnesDataProvider", dataProviderClass = DataProviderClass.class)
    public static void getConsecutiveOnes(int[] arr)
    { int count= 1;
        for (int i =0 ; i < arr.length-1 ; i++)
        {
            if(arr[i] == arr[i+1] && arr[i]==1){ count++; }
        }
        System.out.println("consecutiveOne's count is :" + count);
    }

    // PHONEPE - Round1
    @Test (dataProvider = "getConsecutiveOnes1DataProvider", dataProviderClass = DataProviderClass.class)
    public static void getConsecutiveOnes1(int[] arr)
    { int currentCount = 0, maxCount = 0;
        for (int i : arr)
        {
            if(i == 1)
            {
                currentCount++;
                if(currentCount > maxCount)
                    maxCount = currentCount;
            }
            else
                currentCount = 0;
        }
        System.out.println("consecutiveOne's count is :" + maxCount);
    }

    // PHONEPE - Round1
    @Test (dataProvider = "uniqueCharacterDataProvider", dataProviderClass = DataProviderClass.class)
    public static void uniqueCharacter(String str){
        char[] charArray = str.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : charArray)
            charCount.put(c,charCount.getOrDefault(c,0)+1);

        for (char c : charArray)
            if(charCount.get(c)==1) {
                System.out.println("Unique character is : " + c);
                return;
            }
        //return '\0';
        System.out.println("Unique character is : " + '\0');

    }

    @Test
    public static void stringFrequency(){
        int k=0,m=0;
        String[] S = { "the", "quick", "brown", "fox","quicks"};
        String word1 = "quick", word2 = "fox";

        for(int i = 0 ; i <= S.length-1 ; i++ )
        {
            if(S[i].equalsIgnoreCase(word1))
                k=i;
            if(S[i].equalsIgnoreCase(word2))
                m=i;

        }
        System.out.println("Distance b/w word's is :" +(m-k));
    }

    @Test
    public static void distanceBetweenStrings(){
        String[] S = { "the", "quick", "brown", "fox","quick"};
        int count=0;

        for(int i = 0 ; i <= S.length-1 ; i++ )
        {
            for(int j = i+1 ; j <= S.length-1 ; j++ )
            {
                if(S[i].equalsIgnoreCase(S[j]) && ! S[i].equals("")) {
                    System.out.println("the matching words are: " + S[i] + " " + S[j]);
                    count = j-i;
                }
            }
        }
        System.out.println("Distance b/w word's is :" +count);
    }

    // Zeta  - Round1
    @Test (dataProvider = "stringSequenceCheckerDataProvider", dataProviderClass = DataProviderClass.class)
    public static void stringSequenceChecker(String[] arr){
        String[] seq = new String[]{"Requirement Analysis", "Design", "Development", "Testing", "Deployment", "Maintenance"};
        if(arr.length > 1)
        {
            for(int i = 0 ; i <= arr.length-1 ; i++)
            {
                for (int j = 0 ; j <= seq.length-1 ; j++)
                {
                    if(arr[i].equalsIgnoreCase(seq[j]))
                    {
                        for(int x = i+1 ; x <= arr.length-1 ; x++)
                        {
                            for(int y = j+1 ; y <= seq.length-1 ; y++)
                            {
                                if(arr[x].equalsIgnoreCase(seq[y])) {
                                    System.out.println("First Sequence string : " + arr[i]);
                                    System.out.println("Second Sequence string : " + arr[x]);
                                }
                            }
                        }
                    }
                }
            }
        }
        else
            System.out.println("Give me valid array");
    }

    @Test (dataProvider = "fibonacciCheckerDataProvider", dataProviderClass = DataProviderClass.class)
    public static void fibonacci(int num){
        int i=0, j=1, temp=0;
       // for(int k = 1 ; i <= num ; k++)
        while(i <= num)
        {
            System.out.println(i);
            temp = i+j;
            i = j;
            j = temp;
        }
    }

    @Test (dataProvider = "removeDuplicateCharsDataProvider", dataProviderClass = DataProviderClass.class)
    public static void removeDuplicateChars(String str) {
        // "my name is Ramesh"
        System.out.println("Given String is  : " + str);
        char[] charArray = str.toCharArray();
        HashMap<Character,Integer> charCount = new HashMap<>();
        String uniqueChar = "", duplicateChars = "";

        for (char c : charArray)
        {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : charArray)
        {
            if(charCount.get(c) <= 1)
                uniqueChar += String.valueOf(c);
            else if(charCount.get(c) > 1)
                duplicateChars += String.valueOf(c);
        }
        System.out.println("Unique char's are : " + uniqueChar);
        System.out.println("Duplicate char's are : " + duplicateChars);

    }

    @Test (dataProvider = "findLeadersInArrayDataProvider", dataProviderClass = DataProviderClass.class)
    public static void findLeadersInArray(int[] arr) {
      // {42,65,3,78,56,12} -> 12,56,78
        int len = arr.length;
        int maxEle = arr[len-1];
        System.out.print(maxEle + " ");
        for(int i = len-2 ; i >= 0 ; i--)
        {
            if(arr[i] >= maxEle){
                maxEle = arr[i];
                System.out.print(maxEle + " ");
            }
        }

    }

    @Test (dataProvider = "bubbleSortDataProvider", dataProviderClass = DataProviderClass.class)
    public static void bubbleSort(int[] arr) {
        for(int i=0 ; i < arr.length-1 ; i++)
        {
            for(int j = 0 ; j < arr.length-1 ; j++)
            {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
            System.out.println("After " + (i) + " iteration "+Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

    // BIG BASKET - Round - 2
    @Test (dataProvider = "runLengthEncodingDataProvider", dataProviderClass = DataProviderClass.class)
    public static void runLengthEncoding(String str){
        // aabbbccaa → a2b3c2a2
        StringBuilder builder = new StringBuilder();
        int count = 1;

       for(int i = 1 ; i <= str.length(); i++)
       {
           if(i < str.length() && str.charAt(i) == str.charAt(i-1)) {
               count++;
           }
           else {
               if( str.charAt(i - 1) == ' ')
                   builder.append(str.charAt(i - 1));
               else
                   builder.append(str.charAt(i - 1)).append(count);
               count = 1;
           }
       }
       System.out.println("Run Length Encoding : " +builder);
    }

    // BIG BASKET - Round - 2
    @Test (dataProvider = "ReverseAlphabetDataProvider", dataProviderClass = DataProviderClass.class)
    public static void ReverseAlphabet(String str){
        // aabyz - > zzyba;  a=z,b=y,c=x
        char[] ch = str.toCharArray();
        char charc ;
        StringBuilder reverseString = new StringBuilder();
        for(char c : ch) {
            if(c != ' ')
            {
                charc = Character.isLowerCase(c) ? (char) ('z' - (c - 'a')) : (char) ('Z' - (c - 'A'));
                reverseString.append(charc);
            }
            else
                reverseString.append(' ');
        }
        System.out.println(reverseString);
    }

    // // Games 24/7 - Round 1
    @Test (dataProvider = "ReverseAlphabetDataProvider", dataProviderClass = DataProviderClass.class)
    public static void swapCharacterCaseInString(String str){
        //Input: HeLlo WoRld
        //Output: hElLO wOrLD
        char[] ch = str.toCharArray();
        StringBuilder resultString = new StringBuilder();

        for(char c: ch)
            resultString.append( (Character.isLowerCase(c))? Character.toUpperCase(c) : Character.toLowerCase(c));
        System.out.println(resultString);
    }

    // Games 24/7 - Round 1
    @Test (dataProvider = "checkStringCharactersAreEqualDataProvider", dataProviderClass = DataProviderClass.class)
    public static void checkStringCharactersAreEqual(String str1, String str2){
        // Anagram
        // Input: Sister,Resist
        // Output: true

        // Input: Sister,Resiss
        // Output: false

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : str1.toLowerCase().toCharArray())
            map1.put(c, map1.getOrDefault(c, 0) + 1);

        for(char c : str2.toLowerCase().toCharArray())
            map2.put(c, map2.getOrDefault(c, 0) + 1);

        if(map1.equals(map2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are Not equal");
    }

    // RedBus - Round1
    @Test
    public static void countOfPinCodeOccurrences(){
        String[] addresses = {
                "D-12,12th main,3rd cross,Dhurv Apts,Indiranagar,Bangalore - 560008",
                "D-13,13th main,42nd cross,Dhurv Apts,Kormanagala,Bangalore - 560023",
                "T-12,20th main,4th cross,Heriatge Apts,Indiranagar,Bangalore - 560008",
                "Door No:345,1st main,3rd cross,Team Apts,Hulsoor,Bangalore - 560023",
                "Door No:356,12th main,4th cross,SS Apts,HSR,Bangalore - 560589",
                "S-12,3rd cross,shanthi Apts,Indiranagar,Bangalore - 560008"
        };

        HashMap<String , Integer> pinCount = new HashMap<>();
        for(String address  : addresses) {
            String pin = address.substring(address.length() - 6);
            pinCount.put(pin, pinCount.getOrDefault(pin, 0) +  1);
        }

        for(Map.Entry<String , Integer> entry : pinCount.entrySet())
        {
            if(entry.getValue() > 1)
                System.out.println("Pin code Occurrences are : " + entry.getKey() + " - " +  entry.getValue());
        }
    }

    @Test (dataProvider = "reverseNumberDataProvider", dataProviderClass = DataProviderClass.class)
    public static void reverseNumber(int num) {
        // 3483074 -> 4703843
        int reverseNum = 0;
        while(num > 0)
        {
            reverseNum = reverseNum * 10 + num % 10 ;
            num = num/10;
        }
        System.out.println(reverseNum);
    }

    @Test (dataProvider = "reverseWordsDataProvider", dataProviderClass = DataProviderClass.class)
    public static void reverseWords(String str) {
        // Hello there ! Ramesh Here -> ereH hsemaR ! ereht olleH
        // Hello there ! Ramesh Here -> olleH ereht ! hsemaR ereH

        System.out.println("Given String is : "+ str);
        StringBuilder builder = new StringBuilder();
        String[] words = str.split(" ");
        for ( int i = words.length-1 ; i >= 0 ; i--)     // string reverse and word reverse
        //for ( int i = 0 ; i <= words.length-1 ; i++)   // in place word reverse
        {
            String word = words[i];

            for(int j = word.length()-1 ; j >= 0 ; j--)
            {
                if(Character.isLowerCase(word.charAt(j)))
                    builder.append(word.charAt(j));
                else
                    builder.append(Character.toUpperCase(word.charAt(j)));
            }
            builder.append(" ");
        }
        System.out.println("String Reverse is : "+builder.toString());
    }

    @Test (dataProvider = "pyramidPatternDataProvider", dataProviderClass = DataProviderClass.class)
    public static void pyramidPattern(int num){

        for(int i = 1 ; i <= num ; i++)
        {
            for(int j = num - i ; j > 0 ; j--)
                System.out.print(" ");

            for(int k = 1 ; k <= i ; k++)
                System.out.print(" *");

            System.out.println();
        }

        for(int x = num - 1 ; x >= 0 ; x-- )
        {
            for(int y = 1 ; y <= num - x ; y++ )
                System.out.print(" ");

            for( int z = 1 ; z <= x ; z++)
                System.out.print(" *");

            System.out.println();
        }
    }

    @Test (dataProvider = "swapAlternateCharsDataProvider", dataProviderClass = DataProviderClass.class)
    public static void swapAlternateChars(String str){
        System.out.println("Given String is : "+ str);
        char[] ch = str.toCharArray();
        int len = ch.length;
         for(int i = 0 ; i < len/2 ; i += 2 )
         {
             char temp = ch[i];
             ch[i] = ch[len - 1 - i];
             ch[len - 1 - i] = temp;
         }
         System.out.println(ch);
    }


        public static void main(String[] args)
    {
        // *** Consecutive Ones *** (PHONEPE - Round1 )
        //int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        //int[] arr = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        //getConsecutiveOnes(arr);
        //getConsecutiveOnes1(arr);

        // *** unique Character *** (PHONEPE - Round1 )
        //System.out.println("unique Character is : " + uniqueCharacter("cookiecrumble"));

        // *** string Frequency ***
        //stringFrequency();

        // *** distance Between Strings ***
       // distanceBetweenStrings();

        // *** string Sequence Checker *** (Zeta  - Round1)
       // String[] str = new String[]{"Testing", "Developments", "Testings", "Designs", "Maintenance"};
        //stringSequenceChecker(str);

        // *** fibonacci Series ***
        //fibonacci(1000);

        // *** Remove Duplicate char's ***
        //String str = "my name is Ramesh";
        //removeDuplicateChars(str);

        // *** find max elements in array ***
        //int[] a = new int[]{1, 5, 26, 34, 7, 18, 54,1,0,40};
        //bubbleSort(a);

        // *** find Leaders In Array ***
        //int[] arrLeader = new int[]{1,2,3,4,5,94,93,92,0,82,65,3,78,56,12};
        //findLeadersInArray(arrLeader);

        // *** Run Length Encoding *** (BIG BASKET - Round - 2)
        //runLengthEncoding("aabbbccaa");

        // *** Reverse Alphabet *** (BIG BASKET - Round - 2)
        //ReverseAlphabet("RAMESHramesh");

        // *** swap Character Case In String *** ( Games 24/7 - Round 1)
        //swapCharacterCaseInString("HeLlo WoRld goTVGHHjvH gyhygbTITGB gib");

        // *** check String Characters Are Equal in 2 strings*** ( Games 24/7 - Round 1)
        //checkStringCharactersAreEqual("Sister", "Resist");

        // *** count Of PinCode Occurrences *** ( RedBus - Round 1)
        //countOfPinCodeOccurrences();

        // *** reverse Number ***
        //reverseNumber(3483074);

        // *** reverse Words in a String  ***
        //reverseWords("Hello there ! Ramesh Here");

        // *** pyramid Pattern  ***
       // for (int i = 1; i <=20; ++i) {
         //   pyramidPattern(i);
        //}

        // *** swap Alternate Chars in a string ***
        //swapAlternateChars("abcdefgh");

    }




    //------------ practice----------



    @Test (dataProvider = "getConsecutiveOnes1DataProvider", dataProviderClass = DataProviderClass.class)
    public static void getConsecutiveOne(int[] arr)
    { int count = 1,maxCount = 0;
        for(int num : arr)
        {
         if(num == 1)
         {
             count++;
             if(count > maxCount)
                 maxCount = count;
         }
         else
             count = 0;
        }
        System.out.println("Consecutive Ones is : " + maxCount);
    }

    @Test (dataProvider = "uniqueCharacterDataProvider", dataProviderClass = DataProviderClass.class)
    public static void uniqueCharacter1(String str){
       HashMap<Character, Integer> charCount = new HashMap<>();
       char[] charArray = str.toCharArray();

       for(char ch : charArray)
           charCount.put(ch,charCount.getOrDefault(ch,0)+1);

       for(char c : charArray)
       {
           if (charCount.get(c) <= 1) {
               System.out.println("Unique Character is :" + c);
               return;
           }
       }
       System.out.println("Unique Character is :" + '\0');
    }

    @Test
    public static void stringFrequency1(){
        String[] S = { "the", "quick", "brown", "fox","quicks"};
        String word1 = "the", word2 = "quicks";
        int k=0,l=0;

        for(int i=0; i <= S.length-1; i++)
        {
            if(S[i].equalsIgnoreCase(word1))
                k = i;
            if(S[i].equalsIgnoreCase(word2))
                l = i;
        }
        System.out.println("Distance b/w word's is :" +(l-k));
    }

    @Test (dataProvider = "stringSequenceCheckerDataProvider", dataProviderClass = DataProviderClass.class)
    public static void stringSequenceChecker1(String[] arr){
        String[] seq = new String[]{"Requirement Analysis", "Design", "Development", "Testing", "Deployment", "Maintenance"};
        if(arr.length > 1) {
            for (int i = 0; i <= arr.length - 1; i++) {
                for (int j = 0; j <= seq.length - 1; j++) {
                    if (arr[i].equalsIgnoreCase(seq[j])) {
                        for (int k = i + 1; k <= arr.length - 1; k++) {
                            for (int l = j + 1; l <= seq.length - 1; l++) {
                                if (arr[k].equalsIgnoreCase(seq[l])){
                                    System.out.println("Sequence strings are : " +arr[i] + " " + arr[k]);
                                //return;
                                    }
                            }
                        }
                    }
                }
            }
        }
    }

    @Test (dataProvider = "fibonacciCheckerDataProvider", dataProviderClass = DataProviderClass.class)
    public static void fibonacci1(int num){
        int i=0,j=1,temp;
        while(i <= num)
        //for(int k = 1 ; k <= num ; k++)
        {
            System.out.println(i);
            temp = i+j;
            i = j;
            j = temp;
        }
    }

    @Test (dataProvider = "findLeadersInArrayDataProvider", dataProviderClass = DataProviderClass.class)
    public static void findLeadersInArray1(int[] arr) {
        // {42,65,3,78,56,12} -> 12,56,78
        int firstNum = arr[arr.length-1];
        System.out.print("Leaders from right are : "+ firstNum);
        for(int i = arr.length-2; i >= 0 ; i-- )
        {
            if(arr[i] > firstNum){
                firstNum = arr[i];
                System.out.print(" "+firstNum);
            }
        }
    }

    @Test (dataProvider = "bubbleSortDataProvider", dataProviderClass = DataProviderClass.class)
    public static void bubbleSort1(int[] arr) {
        for(int i =0 ; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort is : "+ Arrays.toString(arr));
    }

    @Test (dataProvider = "runLengthEncodingDataProvider", dataProviderClass = DataProviderClass.class)
    public static void runLengthEncoding1(String str){
        // aabbbccaa → a2b3c2a2

        int count = 1 ;
        StringBuilder builder = new StringBuilder();

        System.out.println("Given String is : " + str);
        for(int i = 1 ; i <= str.length() ; i++)
        {
            if(i < str.length() && str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }
            else
            {
                if(str.charAt(i -1) == ' ')
                    builder.append(str.charAt(i-1));
                else
                    builder.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        System.out.println("Run Length Encoding is : " + builder);
    }

    @Test (dataProvider = "ReverseAlphabetDataProvider", dataProviderClass = DataProviderClass.class)
    public static void ReverseAlphabet1(String str){
        // aabyz - > zzyba;  a=z,b=y,c=x
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for( char c : arr)
        {
            if(c != ' ')
                 c = Character.isLowerCase(c) ? (char) ('z' - (c - 'a')) : (char) ('Z' - (c - 'A'));
            builder.append(c);
        }
        System.out.println("Reverse Alphabet is : "+ builder.toString());
    }

    @Test (dataProvider = "ReverseAlphabetDataProvider", dataProviderClass = DataProviderClass.class)
    public static void swapCharacterCaseInString1(String str){
        //Input: HeLlo WoRld
        //Output: hElLO wOrLD
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for( char c : arr)
        {
            builder.append(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        System.out.println("Swapping Character is : "+ builder.toString());
    }

    @Test (dataProvider = "checkStringCharactersAreEqualDataProvider", dataProviderClass = DataProviderClass.class)
    public static void checkStringCharactersAreEqual1(String str1, String str2){
        // Input: Sister,Resist
        // Output: true

        // Input: Sister,Resiss
        // Output: false

        System.out.println("Given String is : " + str1 + " " + str2);
        HashMap<Character, Integer> word1 = new HashMap<>();
        HashMap<Character, Integer> word2 = new HashMap<>();

        for(char c : str1.toLowerCase().toCharArray())
            word1.put(c,word1.getOrDefault(c,0)+1);

        for(char c : str2.toLowerCase().toCharArray())
            word2.put(c,word2.getOrDefault(c,0)+1);

        if(word1.equals(word2))
            System.out.println("Strings are equal" + word1 + " " + word2);
        else
            System.out.println("Strings are Not equal" + word1 + " " + word2);
    }


    @Test
    public static void countOfPinCodeOccurrences1(){
        String[] addresses = {
                "D-12,12th main,3rd cross,Dhurv Apts,Indiranagar,Bangalore - 560008",
                "D-13,13th main,42nd cross,Dhurv Apts,Kormanagala,Bangalore - 560023",
                "T-12,20th main,4th cross,Heriatge Apts,Indiranagar,Bangalore - 560008",
                "Door No:345,1st main,3rd cross,Team Apts,Hulsoor,Bangalore - 560023",
                "Door No:345,1st main,3rd cross,Team Apts,Hulsoor,Bangalore - 560023",
                "Door No:345,1st main,3rd cross,Team Apts,Hulsoor,Bangalore - 560023",
                "Door No:356,12th main,4th cross,SS Apts,HSR,Bangalore - 560589",
                "S-12,3rd cross,shanthi Apts,Indiranagar,Bangalore - 560008"
        };
        HashMap<String,Integer> pinCount = new HashMap<>();

        for(String address : addresses)
        {
            String pinCode = address.substring(address.length()-6);
            pinCount.put(pinCode,pinCount.getOrDefault(pinCode,0)+1);
        }

        System.out.println("Pin count map : " + pinCount);

        Map.Entry<String,Integer> maxEntry = null;
        int maxCount = 0;
        for(Map.Entry<String,Integer> entry : pinCount.entrySet())
        {
            if(entry.getValue() >= maxCount) {
                maxEntry = entry;
                maxCount = entry.getValue();
            }
        }
        System.out.println("Max Occurrences of Pin Code is : " + maxEntry.getKey() + " - " + maxEntry.getValue());
    }

    @Test (dataProvider = "reverseNumberDataProvider", dataProviderClass = DataProviderClass.class)
    public static void reverseNumber1(int num) {
        // 3483074 -> 4703843

        int revNum = 0;
        while(num > 0)
        {
            revNum = revNum * 10 + num % 10;
            num = num/10;
        }
        System.out.println("Reverse Number is : " + revNum);
    }


    @Test (dataProvider = "reverseWordsDataProvider", dataProviderClass = DataProviderClass.class)
    public static void reverseWords1(String str) {
        // Hello there ! Ramesh Here -> ereH hsemaR ! ereht olleH
        // Hello there ! Ramesh Here -> olleH ereht ! hsemaR ereH

        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int j = 0 ; j <= words.length-1 ; j++)
        //for(int j = words.length-1 ; j >= 0; j--)
        {
            for(int i = words[j].length()-1 ; i >= 0 ; i--)
            {
                sb.append( Character.isLowerCase(words[j].charAt(i)) ? words[j].charAt(i) : Character.toUpperCase(words[j].charAt(i)) );
            }
            sb.append(" ");

        }
        System.out.println("Reverse Words is : " + sb.toString());
    }


    @Test (dataProvider = "pyramidPatternDataProvider", dataProviderClass = DataProviderClass.class)
    public static void pyramidPattern1(int num){

        for(int i =1; i <= num ; i++)
        {
            for(int j = 0 ; j <= num - i ; j++ )
                System.out.print(" ");
            for(int k = 0 ; k < i ; k++)
                System.out.print(" *");
            System.out.println();
        }

        for(int i = num -1 ; i >= 0 ; i--)
        {
            for(int j = 0 ; j <= num - i ; j++ )
                System.out.print(" ");
            for(int k = 0 ; k < i ; k++)
                System.out.print(" *");
            System.out.println();
        }
    }


    @Test (dataProvider = "swapAlternateCharsDataProvider", dataProviderClass = DataProviderClass.class)
    public static void swapAlternateChars1(String str){
        // abcdefgh -> hbfdecga
        System.out.println("Given String is : "+ str);

        char[] arr = str.toCharArray();
        char temp ;

        for(int i = 0 ; i < arr.length/2 ; i += 2)
        {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("Swapped Alternate Chars is : "+ String.valueOf(arr));
    }

    @Test
    public static void maximumLength(String str)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the mimimum value : ");
        int min = read.nextInt();
        System.out.println("Enter the maximun value : ");
        int max = read.nextInt();
        if(min > max)
        {
            System.out.println("Invalid Input....");
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(((max - min ) + 1) + min);
            System.out.println("The random value b/w " + min + " and " + max + " is : "
                    + randomValue);
        }
    }

    @Test (dataProvider = "secondLargestDigitDataProvider", dataProviderClass = DataProviderClass.class)
    public static void secondLargestDigit(String s) {

        Set<Integer> set = new TreeSet<>();

        for (char c : s.toCharArray())
        {
            if(Character.isDigit(c))
                set.add(c - '0');
        }
        System.out.println(set.toString());
        System.out.println("Second Largest Digit is :");
        System.out.println( set.size() >= 2 ? new ArrayList<>(set).get(1) : -1);
    }

    @Test (dataProvider = "mergeTwoArraysDataProvider", dataProviderClass = DataProviderClass.class)
    public static void mergeTwoArrays(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int[] arr = new int[len];
        int index = 0;
        for(int i : arr1)
            arr[index++] = i;
        for(int j : arr2)
            arr[index++] = j;
        System.out.println(Arrays.toString(arr));

    }

    @Test (dataProvider = "incrementANumberRepresentedAsAnArrayDataProvider", dataProviderClass = DataProviderClass.class)
    public static void incrementANumberRepresentedAsAnArray(int[] arr) {
        //int[] arr = {1, 2, 3};
        //int[] arr = {9, 9, 9};
        //int[] arr = {1, 3, 9};

        int n = arr.length;
        boolean carry = true;

        for (int i = n - 1; i >= 0 && carry; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                carry = false;
            } else {
                arr[i] = 0;
            }
        }

        if (carry) {
            int[] newArr = new int[n + 1];
            newArr[0] = 1;
            System.out.println(Arrays.toString(newArr));
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }


    @Test (dataProvider = "duplicateElementsInListDataProvider", dataProviderClass = DataProviderClass.class)
    public static void duplicateElementsInList(List<String> list) {
        Map<String, List<Integer>> map = new HashMap<>();
         for(int i = 0 ; i < list.size(); i++)
             map.computeIfAbsent(list.get(i), k -> new ArrayList<>()).add(i);
         map.forEach((key,value) -> {
             if(value.size() > 1)
             { System.out.println( key + " :" + value); }});
    }

    @Test (dataProvider = "calculateTradeAmountsDataProvider", dataProviderClass = DataProviderClass.class)
    public static void calculateTradeAmounts(List<Trade> trades) {
        int totalAmount = 0;
        for(Trade trade : trades)
        {
            switch (trade.type){
            case BUY :
                totalAmount += trade.amount;
                break;
            case SELL :
                totalAmount -= trade.amount;
                break;
            case CANCEL :
                break;
        }
        }
        System.out.println(totalAmount);
    }

    @Test (dataProvider = "duplicateWordsInStringDataProvider", dataProviderClass = DataProviderClass.class)
    public static void duplicateWordsInString(String str) {
       String[] words = str.replaceAll("[^a-zA-Z]]", "").split("\\s+");
       Map<String, List<Integer>> map = new HashMap<>();

       for(int i = 0 ; i < words.length ; i++)
       {
           map.computeIfAbsent(words[i], k -> new ArrayList<>())
                   .add(i);
       }
       for (Map.Entry<String, List<Integer>> entry : map.entrySet())
       {
           if(entry.getValue().size() > 1)
               System.out.println(entry.getKey() + " : " + entry.getValue());
       }
    }

    // Given a key–value pair string, print the output in order
    @Test
    public void sortKeyValueString()
    {
        String input = "b=2,a=1,d=4,c=3";

        Map<String, String> map = new TreeMap<>();

        String[] pairs = input.split(",");
        for (String pair : pairs) {
            String[] kv = pair.split("=");
            map.put(kv[0], kv[1]);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result.append(entry.getKey())
                    .append("=")
                    .append(entry.getValue())
                    .append(",");
        }

        // remove last comma
        result.setLength(result.length() - 1);

        System.out.println(result);
    }

    //Given an integer array:
    //	•	Find the second highest value
    @Test
    public void secondHighestInArrayList()
    { int[] arr = {10, 5, 20, 8, 20};
        //5, 8, 10, 20

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second highest value");
        } else {
            System.out.println("Second highest = " + secondMax);
        }
    }

    //reversing array
    @Test
    public static void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        //System.out.println(Arrays.toString(arr));
    }

    //Given transaction data:
    //	•	Remove duplicates using Set
    //	•	Ignore error records
    //	•	Print unique values
    @Test
    public static void transactionProcessor() {
        List<String> transactions = Arrays.asList(
                "TXN1001",
                "TXN1002",
                "ERROR",
                "TXN1001",
                "INVALID",
                "TXN1003",
                "TXN1002",
                "TXN1004"
        );

        // Set automatically removes duplicates
        Set<String> uniqueTransactions = new HashSet<>();

        for (String txn : transactions) {

            // Ignore error records
            if (txn.equalsIgnoreCase("ERROR")
                    || txn.equalsIgnoreCase("INVALID")) {
                continue;
            }

            uniqueTransactions.add(txn);
        }

        // Print unique valid transactions
        System.out.println("Unique Transactions:");
        for (String txn : uniqueTransactions) {
            System.out.println(txn);
        }
    }

    //Given transaction string with transaction IDs:
    //	•	Find duplicates
    //	•	Print positions
    @Test
    public static void transactionDuplicatePositions() {
        String transactions =
                "TXN1001,TXN1002,TXN1001,TXN1003,TXN1002,TXN1004,TXN1001";

        String[] txnArray = transactions.split(",");

        // Map to store transaction ID -> list of positions
        Map<String, List<Integer>> positionMap = new LinkedHashMap<>();

        for (int i = 0; i < txnArray.length; i++) {
            String txn = txnArray[i];

            positionMap
                    .computeIfAbsent(txn, k -> new ArrayList<>())
                    .add(i);
        }

        // Print only duplicates (appearing more than once)
        for (Map.Entry<String, List<Integer>> entry : positionMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println(
                        entry.getKey() + " -> positions: " + entry.getValue()
                );
            }
        }
    }

    //Tally transaction data using collections:
    //	•	Debit / Credit per transaction ID
    //	•	Calculate final balance
    //	•	Provide result only for transaction ID 101
    @Test
    public static void tallyTransactionProcessor() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(101, "CREDIT", 1000),
                new Transaction(102, "CREDIT", 500),
                new Transaction(101, "DEBIT", 200),
                new Transaction(101, "CREDIT", 300),
                new Transaction(103, "DEBIT", 100),
                new Transaction(101, "DEBIT", 150)
        );

        int targetTransactionId = 101;
        double balance = 0.0;

        for (Transaction txn : transactions) {

            if (txn.id == targetTransactionId) {

                if (txn.type.equalsIgnoreCase("CREDIT")) {
                    balance += txn.amount;
                } else if (txn.type.equalsIgnoreCase("DEBIT")) {
                    balance -= txn.amount;
                }
            }
        }

        System.out.println("Final balance for Transaction ID "
                + targetTransactionId + " = " + balance);
    }

    //Find occurrence of each character:
    //	•	Ignore spaces
    //	•	Display output in sorted order
    //	•	Case-sensitive
    //	•	Example: "success 2026"
    @Test
    public static void characterOccurrence(){
        String input = "success 2026";

        // TreeMap keeps keys sorted automatically
        Map<Character, Integer> charCountMap = new TreeMap<>();

        for (char ch : input.toCharArray()) {

            // Ignore spaces
            if (ch == ' ') {
                continue;
            }

            // Count occurrences
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Display result
        charCountMap.forEach((key, value) ->
                System.out.println(key + " -> " + value)
        );
    }

    //min and max values in array
    @Test
    public static void minAndMAxInArray(){
        int[] arr = {5, 3, 9, 1, 6,0,100};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    @Test (dataProvider = "isNumberPalindromeDataProvider", dataProviderClass = DataProviderClass.class)
    public static void isNumberPalindrome(int num) {
        // 3483074 -> 4703843
        int reverseNum = 0, actNum = num;
        while(num > 0)
        {
            reverseNum = reverseNum * 10 + num % 10 ;
            num = num/10;
        }
        if(reverseNum == actNum)
            System.out.println("Given Number "+ actNum +" is Palindrome");
        else
            System.out.println("Given Number "+ reverseNum +" is not a Palindrome");
    }

    @Test //(dataProvider = "mergeAndSortArrayDataProvider", dataProviderClass = DataProviderClass.class)
    public static void mergeAndSortArray() {
        int[] arr1 = {1,3,6,9};
        int[] arr2 = {3,7,8,9};
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0 ;

        for (int n :  arr1)
            arr3[index++] = n;

        for (int n :  arr2)
            arr3[index++] = n;

        Arrays.sort(arr3);

        // With duplicates
        System.out.println("Merged Array with Duplicates :" + Arrays.toString(arr3));

        // With out duplicates
        Set<Integer> set = new TreeSet<>();
        for (int n :  arr3)
            set.add(n);
        System.out.println("Merged Set without duplicates :" + set);
    }


}
