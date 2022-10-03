package DSA.recursion;

public class Fibonacci {
    public static void main(String args[]){

        int n = 5;
        for(int i=0; i<=5;i++){
            System.out.println(getFibonacci(i));
        }
    }

    public static int getFibonacci(int n){
        if(n<=1){
            return n;
        }

        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}
