package DSA.sorting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InsertionSort {
    public static void main(String args[]) throws JsonProcessingException {
        int[] array = {1, 5, 3, 2, 8};

        for (int i = 0; i < array.length-1;i++){
            int key = array[i];
            int j = i-1;

            while(j >=0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }

            array[j+1] = key;
        }
        System.out.println(new ObjectMapper().writeValueAsString(array));
    }
}
