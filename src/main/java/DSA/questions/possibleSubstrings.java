package DSA.questions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class possibleSubstrings {
    public static void main(String args[]) throws JsonProcessingException {
        String str = "aabaa";
        List<String> substrings = new ArrayList<>();
        getSubstrings(str,0,0,substrings);
//        getSubstrings(str,substrings);
        Map<String,Integer> map = new HashMap<>();


        for(String str3:substrings){
            map.put(str3,map.getOrDefault(str3,0)+1);
        }
        System.out.println(new ObjectMapper().writeValueAsString(substrings));
        System.out.println(new ObjectMapper().writeValueAsString(map));

    }

    public static List<String> getSubstrings(String str, int i, int j, List<String> substrings){
        if(i==str.length()){
            return substrings;
        }
        String str2 = str.substring(i,j);
        if(j == str.length()){
            i = i+1;
            j = i+1;
        }
        else
             j = j+1;
        substrings.add(str2);
        getSubstrings(str,i,j,substrings);

        return substrings;
        }

}

