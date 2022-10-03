package DSA.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurances {
    public static void main(String args[]){
//        Given an array of integers arr, return true if the number of occurrences of each value
//        in the array is unique, or false otherwise.
//        Example 1:
//
//        Input: arr = [1,2,2,1,1,3]
//        Output: true
//        Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have
//        the same number of occurrences.
        int[] input = {1,2,2,1,3};
        Map<Integer,Integer> count = new HashMap<>();
        Set<Integer> unique = new HashSet<>();
        for(int i: input){
            count.put(i,count.getOrDefault(i,0)+1);
        }

        for(int i:input){
            unique.add(count.get(i));
        }

        if(unique.size() == count.size()){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
