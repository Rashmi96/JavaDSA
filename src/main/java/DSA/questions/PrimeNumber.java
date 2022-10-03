package DSA.questions;

public class PrimeNumber {

    public static void main(String args[]){
        int i = 2;
        int number = 2;
        while(i<= Math.sqrt(number)){
            if(number % i == 0){
                System.out.println("this number is not a prime number");
                break;
            }
            i++;
        }
        System.out.println("this number is a prime number");
    }
}
