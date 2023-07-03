package DSA.recursion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class FrequencyInArray {
    public static void main(String args[]) throws JsonProcessingException {
        int[] array ={1,2,1,3,2,5,3};
        Map<Integer,Integer> count = new HashMap<>();
        int min = 1;
        int max = 1;
        int indexMin, indexMax = 0;

        getFrequency(array,count,0);
        System.out.println(new ObjectMapper().writeValueAsString(count));

        for(int i: count.keySet()){
            if(count.get(i)> count.get(max)) {
                max = i;
            }
            else if(count.get(i)< count.get(min)) {
                min = i;
            }
        }
        System.out.println("max {}, min {}" + max + " " + min);
    }

    public static void getFrequency(int[] array,Map<Integer,Integer> count, int i){
        if(i == array.length)
            return;

        count.put(array[i],count.getOrDefault(array[i],0)+1);

        getFrequency(array,count,i+1);

    }

}
