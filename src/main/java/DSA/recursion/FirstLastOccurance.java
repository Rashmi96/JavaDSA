package DSA.recursion;

import java.util.Locale;

public class FirstLastOccurance {
    public static void main(String args[]){
        String str = "rashmia";
        getFirstlastOccurance(str.toLowerCase(),0,-1,-1,'a');
    }

    public static void getFirstlastOccurance(String str,int ind,int first,int last,char el){
        if(ind >= str.length()){
            System.out.println("first and last occurances are {} and {} respectively" +first +" "+last);
            return;
        }

        if(str.charAt(ind) == el && first == -1){
            first = ind;
        }
        else if(str.charAt(ind) == el && first != -1){
            last = ind;
        }
        getFirstlastOccurance(str,ind+1,first,last,el);

    }
}
