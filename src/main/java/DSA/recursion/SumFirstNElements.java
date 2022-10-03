package DSA.recursion;

public class SumFirstNElements {

    public static void main(String args[]){
        int n= 5;
        int sum = 0;

        sum = getSumFirstNElements(n);
        System.out.println(sum);
    }

    public static int getSumFirstNElements(int n){
        if(n <=0){
            return 0;
        }
        return n + getSumFirstNElements(n-1);
    }
}
