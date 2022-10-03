package DSA.recursion;

public class PrintNTimes {
    public static void main(String args[]){
        int n = 5;
        printNDescending(n);
        System.out.println("");
        printNAscending(n);
    }
    private static void printNDescending(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        printNDescending(n-1);
    }

    private static void printNAscending(int n){
        if(n<=0){
            return;
        }
        printNAscending(n-1);
        System.out.println(n);
    }
}
