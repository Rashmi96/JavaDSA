package DSA.recursion;



public class CheckIfArraySorted {
    public static void main(String args[]){
        int[] arr = {1,2,3,8,5,6};
        boolean check = checkIfSorted(arr,0);
        System.out.println(check);
    }

    public static boolean checkIfSorted(int[] arr, int ind){
        if(ind >= arr.length-1){
            return true;
        }

        if(arr[ind] > arr[ind+1])
            return false;

        return checkIfSorted(arr,ind+1);
    }
}
