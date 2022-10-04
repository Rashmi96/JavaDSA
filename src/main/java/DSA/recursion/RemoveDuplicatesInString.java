package DSA.recursion;

public class RemoveDuplicatesInString {
    public static void main(String args[]) {
        String str = "rashmirashmi";
        boolean[] ifExists = new boolean[26];
        String str2 = removeDuplicate(str,0,ifExists);
        System.out.println(str2);
    }

    public static String removeDuplicate(String str,int ind,boolean[] ifExists){
        if(ind == str.length())
            return "";

        char ch = str.charAt(ind);
        int len = ch-'a';
        if(ifExists[ch-'a']){
            return removeDuplicate(str,ind+1,ifExists);
        }
        else {
            ifExists[ch-'a'] = true;
            return ch + removeDuplicate(str,ind+1,ifExists);
        }

    }
}

