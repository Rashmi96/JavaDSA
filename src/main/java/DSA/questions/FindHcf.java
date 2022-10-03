package DSA.questions;

public class FindHcf {
    public static void main(String args[]){
        int num1 = 4;
        int num2 = 8;

        int i = 1;
        int ans = 0;

        while(i <= num1){
            if(num1%i ==0 && num2 %i ==0){
                ans  = i;
            }
            i++;
        }

        System.out.println(ans);
    }
}
