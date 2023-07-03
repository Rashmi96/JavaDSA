package DSA.arrays.easy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosTolast {

    public static void main(String args[]) throws JsonProcessingException {
        int[] array = {1,3,0,2,0,4,5,0};
        List<Integer> temp = Arrays.asList(1,3,0,2,0,4,5,0);

        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for(int i =0;i<array.length;i++){
           if(temp.get(i) !=0){
               temp1.add(temp.get(i));
           }
           else{
               temp2.add(temp.get(i));
           }
        }
        temp1.addAll(temp2);
        System.out.println(new ObjectMapper().writeValueAsString(temp1));
    }
}
