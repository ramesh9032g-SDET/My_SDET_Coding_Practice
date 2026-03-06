package org.pratcticeOrg.Tests.Test.practice;

public class Zeta {

    public static void orderSequence(String[] arr)
    {
        String[] seq = new String[]{"Requirement Analysis", "Design", "Development", "Testing", "Deployment", "Maintenance"};
        if (arr.length > 1)
        {
            int arrlen = arr.length-1, seqlen = seq.length-1;
            for (int i = 0; i < arrlen; ++i)
            {
                for (int j = 0; j < seqlen; ++j)
                {
                    if (arr[i].equalsIgnoreCase(seq[j]))
                    {
                        for (int m = i + 1; m <= arrlen; ++m)
                        {
                            for (int k = j + 1; k <= seqlen; ++k)
                            {
                                if (arr[m].equalsIgnoreCase(seq[k]))
                                {
                                    System.out.println("First Sequence word is ::  " + arr[i] + "   " + seq[k]);
                                    //System.out.println("second Sequence word is ::  " + arr[m] + "   " + seq[k]);

                                }
                            }
                        }
                    }
                }
            }
        }
        else { System.out.println("Array length should be more than 2"); }
    }


    public static void main(String[] args) {
        //{"Requirement Analysis", "Design", "Development", "Testing", "Deployment", "Maintenance"};
        String[] srtArray = new String[]{"Design", "Developments", "Testings", "Designs", "Maintenance"};
        orderSequence(srtArray);

    }
}
