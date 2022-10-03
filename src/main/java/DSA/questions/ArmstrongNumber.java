package DSA.questions;

public class ArmstrongNumber {
    public static void main(String args[]) {
        int number = 153;

        double res = 0;
        int digits = 0;

        while(number !=0){
            digits = digits+1;
            number = number/10;
        }

        while (number !=0) {
            res = res + Math.pow(number%10,digits);
            number = number/10;
        }
        if(res == number){
            System.out.println("armstrong number");
        }
        else
            System.out.println("Not armstrong number");

    }
}
