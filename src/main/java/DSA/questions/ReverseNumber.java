package DSA.questions;

public class ReverseNumber {
    public static void main(String args[]){
        int number = 12345;
        int result = 0;

        while(number !=0){
            result = result *10 + (number%10);
            number = number/10;
        }
        System.out.println(result);
    }
}
