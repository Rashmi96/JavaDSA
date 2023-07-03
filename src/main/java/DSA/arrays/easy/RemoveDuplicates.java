package DSA.arrays.easy;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args){
        int a[] = {1,1,1,2,2,2,2,3,3,4,4};
        int i = 0;int k =0;

        for(int j=0;j<a.length;j++){
            if(a[i] != a[j]){
                a[k] = a[i];
                i= j; k++;
            }
        }

        for(int m=0;m<a.length;m++)
            System.out.println(a[m]);
    }

}
