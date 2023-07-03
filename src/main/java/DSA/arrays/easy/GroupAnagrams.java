package DSA.arrays.easy;

import java.util.*;
import java.util.stream.Collectors;

//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//        Example 1:
//
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
public class GroupAnagrams {
    public static void main(String args[]){
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String>> map = new HashMap<>();
        List<String> arrList = Arrays.asList(arr);

        for(String s : arrList){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String sorted = String.valueOf(ca);
            if(!map.containsKey(sorted)){
                List<String> s1 = new ArrayList<>();
                s1.add(s);
                map.put(sorted,s1);
            }
            else{
                map.get(sorted).add(s);
            }
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}
