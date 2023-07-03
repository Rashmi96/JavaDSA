package DSA.arrays.easy;

import java.util.*;

//Top K Frequent Elements
//        Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//        Example 1:
//
//        Input: nums = [1,1,1,2,2,3], k = 2
//        Output: [1,2]
public class TopKFrequentElements {
    public static void main(String args[]){
        int [] nums= {1,2};
        int k =2;
        int[] arr= new int[k];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer,Integer>> maps = new ArrayList<>(map.entrySet());
        maps.sort((a,b) -> b.getValue() - a.getValue());

        for(int i=0;i<k;i++){
            arr[i] = maps.get(i).getKey();
            }
        System.out.println(Arrays.toString(arr));
        }
}
