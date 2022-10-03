package DSA.recursion;

public class ReverseString {
    public static void main(String args[]){
        String str = "rashmi";
        getReverse(str,str.length()-1,"");
    }

    public static void getReverse(String str,int ind, String reverse){
        if(ind < 0){
            System.out.println(reverse);
            return;
        }
        char ch = str.charAt(ind);
        getReverse(str,ind-1, reverse.concat(String.valueOf(ch)));

    }
}
