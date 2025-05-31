package DSA.arrays.easy;

public class FindSecondMin {

    public static void main(String args[]){
        int [] arr= {2,3,4,5,1,1,0,0};
        int min= Integer.MAX_VALUE;
        int min_next= Integer.MAX_VALUE;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] < min){
                min= arr[i];
            }
        }

        for(int i = 0; i<arr.length;i++){
            if(arr[i] < min_next && arr[i] > min ){
                min_next= arr[i];
            }
        }
        System.out.println("second min = "+ min_next);
    }
}
