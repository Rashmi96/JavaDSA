package DSA.recursion;

public class Factorial {
    public static void main(String args[]){
        int n = 5;
        int fact = getfactorial(n);
        System.out.println(fact);
    }
    public static int getfactorial(int n){

        if(n<=1)
            return n;

        return n * getfactorial(n-1);
    }
}
