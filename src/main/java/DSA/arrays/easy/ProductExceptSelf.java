package DSA.arrays.easy;

import java.util.Arrays;

//Product of Array Except Self
//        Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//        You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = new int[4];

        for(int i=0; i<arr.length;i++){
            int multiplication =1;
            for(int j =0; j< arr.length;j++){
                if(j != i){
                    multiplication= multiplication * arr[j];
                }
            }
            result[i] = multiplication;
        }
        System.out.println(Arrays.toString(result));
    }

}
