package DSA.arrays.easy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MoveZerosTolast {

    public static void main(String args[]) throws JsonProcessingException {
        int[] array = {1,3,0,2,0,4,5,0};
        int count = 0;


//        for(int i =0;i<array.length-1;i++){
//            if(array[i] == 0 && array[i+1] != 0){
//                swap(array,i,i+1);
//            }
//            else if(array[i] == 0 && array[i+1] == 0){
//                swap(array,i,i+2);
//            }
//        }
        System.out.println(new ObjectMapper().writeValueAsString(array));
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
