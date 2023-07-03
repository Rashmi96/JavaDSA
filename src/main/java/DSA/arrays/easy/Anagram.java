package DSA.arrays.easy;

import java.util.HashMap;

//        Valid DSA.arrays.easy.Anagram
//        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//        An DSA.arrays.easy.Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//        Example 2:
//
//        Input: s = "rat", t = "car"
//        Output: false
public class Anagram {

    public static void main(String args[]){
        String str1 = "anagram";
        String str2 = "nagaram";
        boolean flag= false;

        HashMap<Integer,Integer> map= new HashMap<>();

        str1.chars().forEach(x-> map.put(x,map.getOrDefault(x,0)+1));
        str2.chars().forEach(x-> map.put(x,map.getOrDefault(x,0)-1));
        System.out.println(map.values().stream().allMatch(x-> x==0));
}

}



