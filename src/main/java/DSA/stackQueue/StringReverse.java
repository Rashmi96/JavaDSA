package DSA.stackQueue;

import java.util.Arrays;

public class StringReverse {
    public static void main(String args[]){

        String str = "abc";
        String strReverse = strReverse(str);
        System.out.println(strReverse);

    }

    private static String strReverse(String str) {
        char[] chrArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str);
        int l = 0;
        int h = str.length()-1;
        while(l<h){
            char temp = chrArray[l];
            chrArray[l] = chrArray[h];
            chrArray[h] = temp;
            l++;
            h--;
        }
        return Arrays.toString(chrArray);
    }
}
