package DSA.arrays.easy;

public class EquilibriumPoint {
    public static void main(String args[]){
        /*
        Input: 1 4 2 5
        Output: 2
        Explanation: If 2 is the partition,
        subarrays are : [1, 4] and [5]
         */

        int[] array = {2,3,4,1,4,5};


        for(int i =0;i<array.length-1;i++){
            int sum1 =0, sum2 =0;
            int j = i-1;
            int k = i+1;
            while(j>=0){
                sum1 = sum1 + array[j];
                j--;
            }

            while(k<array.length){
                sum2 = sum2 + array[k];
                k++;
            }
            if(sum1 == sum2)
                System.out.println(array[i]);
        }
    }
}
