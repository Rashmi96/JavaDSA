package DSA.arrays.easy;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,1]
//        Output: true
public class ContainsDuplicate {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 1};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
    }
        System.out.println(map.values().stream().anyMatch(x-> x>1));
}


        }
