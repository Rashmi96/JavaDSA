package DSA.search;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {12,1,34,13,56,30,46};
        int element = 56;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                System.out.println("found element at " + i);
                break;
            }
        }
    }
}
