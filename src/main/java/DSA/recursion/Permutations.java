package DSA.recursion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String []args) throws JsonProcessingException {
        String str = "abc";
        List<String> permution = new ArrayList<>();
//        permutations(str,"");
        permutations(str,0,str.length(),permution);
    }

//    public static void permutations(String str,String permution){
//        if(str.length() == 0){
//            System.out.println(permution);
//            return;
//        }
//
//        for(int i =0; i< str.length();i++){
//            char ch = str.charAt(i);
//
//            String newChar = str.substring(0,i)+str.substring(i+1);
//            permutations(newChar,permution+ch);
//        }
//    }

    public static void permutations(String str, int l, int r, List<String> permution) throws JsonProcessingException {
        if(l==r){
            permution.add(str);
            System.out.println(new ObjectMapper().writeValueAsString(permution));
            return;
        }

        for(int i=l;i< str.length();i++){
            str = swap(str,i,l);
            permutations(str,l+1,r,permution);
            str = swap(str,i,l);
        }
    }

    private static String swap(String str, int i, int l) {
        char []chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[l];
        chars[l] = temp;

        return String.valueOf(chars);
    }

}
