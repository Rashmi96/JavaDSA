package DSA.questions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String args[]) throws JsonProcessingException {
//        you are given an array of size 'N' containing each number between 1 to 'N-1' at least () -> once.
//        There is a single integer value that is present in the array twice.
//        your task is to find the duplicate integer value present in the array.
//        i/p: [1,2,3,4,4] o/p: 4
        int[] input = {1,2,3,4,4,5,5};
        int ans = 0;

      Set<Integer> unique = new HashSet<>();
        List<Integer> res = new ArrayList<>();
      for(int i: input){
          if(!unique.contains(i)){
              unique.add(i);
          }
          else
              res.add(i);
      }
        System.out.println(new ObjectMapper().writeValueAsString(res));
    }
}
