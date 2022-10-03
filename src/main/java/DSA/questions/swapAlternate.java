package DSA.questions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class swapAlternate {
    public static void main(String args[]) throws JsonProcessingException {
//        i/p: [1,3,4,6,8,9] o/p: [3,1,6,4,9,8]
        int [] input = {1,3,4,6,8,9};
        int i =0;
        while(i < input.length){
            if(i+1 < input.length){
                swap(input,i,i+1);
            }
            i=i+2;
        }
        print(input);
    }

    private static void print(int[] input) throws JsonProcessingException {
        System.out.println(new ObjectMapper().writeValueAsString(input));
    }

    private static void swap(int[] input, int i, int i1) {
        int temp = input[i];
        input[i] = input[i+1];
        input[i+1] = temp;
    }
}
