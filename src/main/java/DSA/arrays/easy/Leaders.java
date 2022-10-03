package DSA.arrays.easy;

public class Leaders {
    public static void main(String args[]){
        int[] array = {16,17,4,3,5,2};

        for(int i =0;i<array.length;i++){
            boolean flag = false;
            for(int j =i+1; j<array.length;j++){
                if(array[i] < array[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                System.out.println(array[i]);
        }
    }
}
