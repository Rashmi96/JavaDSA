package DSA.sorting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Selection {
    public static void main(String args[]) throws JsonProcessingException {
        int[] array = {1,3,2,6,3,8};

        for(int i = 0;i<array.length-1;i++){
            int min = i;

            for(int j = i+1;j<array.length-1;j++){
                if(array[j] < array[min])
                    min = j;
            }
            swap(array,i,min);
        }

        System.out.println(new ObjectMapper().writeValueAsString(array));
    }

    public static void swap(int[] array, int i, int min){
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}
