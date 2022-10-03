package DSA.arrays.easy;

public class CountConsecutiveOnes {

    public static void main(String args[]){
        int[] array = {0,1,1,2,3,1,1,1};

        int maxCount = 0, count = 0;

        for (int n : array) {
            if (n == 1) count++;
            else count = 0;
            maxCount = Math.max(count, maxCount);
        }

        System.out.println(maxCount);
    }
}
