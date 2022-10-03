package DSA.questions;

public class FindingUniqueElementInArray {
    public static void main(String args[]){
//        you have been given an integer array of size n, where n = 2M+1.
//        M is the elements present twice and one element is present only once.
//        find that unique element.
//        i/p: [1,2,4,3,4,2,1], o/p: 3
//        we will solve this question using XOR
        int[] input = {1,2,4,3,4,2,1};
        int ans = 0;
        for(int i =0;i<input.length;i++){
            ans = ans ^ input[i];
        }
        System.out.println(ans);
    }
}
