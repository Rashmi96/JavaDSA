package DSA.recursion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReverseArray {
    public static void main(String args[]) throws JsonProcessingException {
        int [] array = {1,2,3,4,5};

        reverseArray(array,0,array.length-1);

        System.out.println(new ObjectMapper().writeValueAsString(array));
    }

    public static void reverseArray(int[] array,int start, int end) throws JsonProcessingException {

        if(start > end)
            return;

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        reverseArray(array,start + 1, end - 1);

    }
}
