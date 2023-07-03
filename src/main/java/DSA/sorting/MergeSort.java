package DSA.sorting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MergeSort {

    public static void main(String args[]) throws JsonProcessingException {
        int [] array = {1,7,5,2,3};
        sort(array,0,array.length-1);
        System.out.println(new ObjectMapper().writeValueAsString(array));
    }

    public static void sort(int[] array,int l,int r) throws JsonProcessingException {
        if(l<r) {
            int mid = l + (r-l) / 2;
            sort(array, l, mid);
            sort(array, mid + 1, r);
            merge(array, l, mid, r);
        }
    }

    private static void merge(int[] array, int l, int mid, int r) throws JsonProcessingException {
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] array1 = new int[n1];
        int[] array2 = new int[n2];

        for(int i = 0; i<n1;++i)
            array1[i] = array[l+i];

        for(int i = 0; i<n2;++i)
            array2[i] = array[i+mid+1];

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(array1[i] < array2[j]){
                array[k] = array1[i];
                i++;
                k++;
            }
            else {
                array[k] = array2[j];
                j++;
                k++;
            }
        }

        while(i<n1){
            array[k] = array1[i];
            i++; k++;
        }

        while(j<n2){
            array[k] = array2[j];
            j++; k++;
        }

    }
}
