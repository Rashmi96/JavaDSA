package DSA.recursion;

public class PrintAllSubSequences {
    public static void main(String []args){
        String str = "abc";
        printSequences(str,"",0);
    }

    public static void printSequences(String str,String seq,int ind){
        if(ind == str.length()){
            System.out.println(seq);
            return;
        }

        char ch = str.charAt(ind);

        //add to sequence
        printSequences(str,seq+ch,ind+1);

        //don't add to the sequence
        printSequences(str,seq,ind+1);

    }
}
