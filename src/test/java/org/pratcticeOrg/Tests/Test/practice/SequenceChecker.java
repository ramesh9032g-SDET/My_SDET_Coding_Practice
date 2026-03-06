package org.pratcticeOrg.Tests.Test.practice;

import java.util.HashMap;
import java.util.Map;

public class SequenceChecker {
    public static void main(String[] args) {
        String[] arr = {"Requirement Analysis", "Design", "Development", "Testing", "Deployment", "Maintenance"};
        orderSequence(arr);
    }

    public static void orderSequence(String[] arr) {
        if (arr.length == 0) return;

        // Define the sequence
        String[] seq = {"Requirement Analysis","Maintenance"};

        // Map to store the sequence phases and their indices for quick lookup
        Map<String, Integer> seqMap = new HashMap<>();
        for (int i = 0; i < seq.length; i++) {
            seqMap.put(seq[i].toLowerCase(), i);
        }

        // Traverse the array and check for sequences
        for (int i = 0; i < arr.length; i++) {
            String lowerArrI = arr[i].toLowerCase();
            if (seqMap.containsKey(lowerArrI)) {
                int seqIndex1 = seqMap.get(lowerArrI);
                for (int j = i + 1; j < arr.length; j++) {
                    String lowerArrJ = arr[j].toLowerCase();
                    if (seqMap.containsKey(lowerArrJ)) {
                        int seqIndex2 = seqMap.get(lowerArrJ);
                        if (seqIndex2 > seqIndex1) {
                            System.out.println("First Sequence is word ::  " + arr[i] + "   " + seq[seqIndex1]);
                            System.out.println("Second Sequence is word ::  " + arr[j] + "   " + seq[seqIndex2]);
                        }
                    }
                }
            }
        }
    }
}
