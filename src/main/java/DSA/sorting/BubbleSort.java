package DSA.sorting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BubbleSort {

    public static void main(String args[]) throws JsonProcessingException {
        int[] array = {1,3,2,5,3,2};

        for(int i = 0; i< array.length-1; i++){

            for(int j = 0; j<array.length-1-i;j++){
                if(array[j] > array[j+1])
                    swap(array, j,j+1);
            }
        }

        System.out.println(new ObjectMapper().writeValueAsString(array));
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
